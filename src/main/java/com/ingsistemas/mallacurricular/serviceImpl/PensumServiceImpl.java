package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.PensumConverter;
import com.ingsistemas.mallacurricular.dto.AsignaturaDto;
import com.ingsistemas.mallacurricular.dto.PensumDto;
import com.ingsistemas.mallacurricular.entity.Asignatura;
import com.ingsistemas.mallacurricular.entity.Pensum;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.exceptions.PropiedadFaltanteException;
import com.ingsistemas.mallacurricular.filters.PensumFilter;
import com.ingsistemas.mallacurricular.repository.AsignaturaRepository;
import com.ingsistemas.mallacurricular.repository.PensumRepository;
import com.ingsistemas.mallacurricular.repository.ProgramaAcademicoRepository;
import com.ingsistemas.mallacurricular.service.PensumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PensumServiceImpl implements PensumService {
    @Autowired
    PensumRepository repo;
    @Autowired
    PensumConverter converter;
    @Autowired
    AsignaturaRepository asiRepo;
    @Autowired
    ProgramaAcademicoRepository programaRepo;

    @Override
    public PensumDto crearOActualizar(PensumDto entidad) throws Exception {
        Pensum pensum = new Pensum();
        if (entidad.getId() != null) {
            pensum = repo.findById(entidad.getId()).get();
        } else {
            pensum.setIdPensum(repo.getNextSeriesId().intValue());
        }

        pensum.setCreditosTotales(entidad.getCreditosTotales());
        List<Asignatura> listaAsignatura = new ArrayList<Asignatura>();
        if (entidad.getAsignaturas() != null) {
            for (AsignaturaDto asiDto : entidad.getAsignaturas()) {
                try {
                    Optional<Asignatura> asiop = asiRepo.findById(asiDto.getCodigo());
                    listaAsignatura.add(asiop.get());
                } catch (NoSuchElementException e) {
                    throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "asignatura", asiDto.getCodigo().toString());
                }

            }
        }

        pensum.setAsignaturas(listaAsignatura);
        try {
            pensum.setProgramaAcademico(programaRepo.findById(entidad.getProgramaAcademico().getIdPrograma()).get());
        } catch (NoSuchElementException e) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Programa Academico", entidad.getProgramaAcademico().getIdPrograma().toString());
        } catch (NullPointerException e) {
            throw new PropiedadFaltanteException(ErrorsEnum.MISSING_PROPERTY, "Pensum", entidad.getProgramaAcademico().getIdPrograma().toString());
        }
        pensum.setFechaInicio(entidad.getFechaInicio());
        pensum.setStatus(true);
        return converter.convert(repo.save(pensum));
    }

    @Override
    public PensumDto getOne(Integer id) throws Exception {
        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<PensumDto> getAll() throws Exception {
        return converter.convert(repo.findAll());
    }

    @Override
    public List<PensumDto> filter(PensumFilter filter) throws Exception {
        return converter.convert(repo.filterByFecha(filter));
    }

    @Override
    public void eliminar(Integer id) {
        try {
            Optional<Pensum> pensumO = repo.findById(id);
            Pensum p = pensumO.get();
            p.setStatus(!p.isStatus());
            repo.save(p);

        } catch (NoSuchElementException e) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "pensum", id.toString());
        }

    }

}
