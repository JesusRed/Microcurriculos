package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.AsignaturaConverter;
import com.ingsistemas.mallacurricular.converter.UnidadConverter;
import com.ingsistemas.mallacurricular.dto.UnidadDto;
import com.ingsistemas.mallacurricular.entity.Asignatura;
import com.ingsistemas.mallacurricular.entity.Unidad;
import com.ingsistemas.mallacurricular.filters.UnidadFilter;
import com.ingsistemas.mallacurricular.repository.AsignaturaRepository;
import com.ingsistemas.mallacurricular.repository.UnidadRepository;
import com.ingsistemas.mallacurricular.service.TemaService;
import com.ingsistemas.mallacurricular.service.UnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UnidadServiceImpl implements UnidadService {
    @Autowired
    UnidadRepository repo;
    @Autowired
    UnidadConverter converter;
    @Autowired
    AsignaturaRepository asignaturaService;
    @Autowired
    AsignaturaConverter asiconverter;
    @Autowired
    TemaService temaService;

    @Override
    public UnidadDto crearOActualizar(UnidadDto entidad) throws Exception {
        Unidad unidad = new Unidad();
        if (entidad.getIdUnidad() != null) {
            Optional<Unidad> opun = repo.findById(entidad.getIdUnidad());
            if (opun.isPresent()) {
                unidad = opun.get();
            } else {
                throw new Exception();
            }

        } else {
            unidad.setIdUnidad(UUID.randomUUID());
        }
        unidad.setHad(entidad.getHad());
        unidad.setHti(entidad.getHti());
        unidad.setIdUnidad(unidad.getIdUnidad());
        unidad.setNombre(unidad.getNombre());
        if (entidad.getAsignatura() != null) {
            if (entidad.getAsignatura().getCodigo() != null) {
                Asignatura asignatura = asignaturaService.findById(entidad.getAsignatura().getCodigo()).get();
                unidad.setAsignatura(asignatura);
            } else {
                Asignatura asignatura = asignaturaService.save(asiconverter.convert(entidad.getAsignatura()));
                unidad.setAsignatura(asignatura);
            }
        }
        if (unidad.getTemas() != null && unidad.getTemas().size() > 0) {

        }
        return converter.convert(repo.save(unidad));
    }

    @Override
    public UnidadDto getOne(UUID id) throws Exception {
        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<UnidadDto> getAll() throws Exception {

        return converter.convert(repo.findAll());
    }

    @Override
    public List<UnidadDto> filter(UnidadFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(UUID id) {
        repo.deleteById(id);

    }


}
