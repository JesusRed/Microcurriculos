package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.CompetenciaConverter;
import com.ingsistemas.mallacurricular.dto.CompetenciaDto;
import com.ingsistemas.mallacurricular.entity.Competencia;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.filters.CompetenciaFilter;
import com.ingsistemas.mallacurricular.repository.CompetenciaRepository;
import com.ingsistemas.mallacurricular.service.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompetenciaServiceImpl implements CompetenciaService {
    @Autowired
    CompetenciaRepository repo;
    @Autowired
    CompetenciaConverter converter;

    @Override
    public CompetenciaDto crearOActualizar(CompetenciaDto entidad) throws Exception {
        Competencia competencia = new Competencia();
        if (entidad.getIdCompetencia() != null) {
            Optional<Competencia> competenciaopi = repo.findById(entidad.getIdCompetencia());
            if (competenciaopi.isPresent()) {
                competencia = competenciaopi.get();
            } else {
                throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Tema", entidad.getIdCompetencia().toString());
            }
        } else {
            competencia.setIdCompetencia(UUID.randomUUID());
        }
        competencia.setDescripcion(entidad.getDescripcion());
        competencia.setNombre(entidad.getNombre());
        return converter.convert(competencia);
    }


    @Override
    public CompetenciaDto getOne(UUID id) throws Exception {

        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<CompetenciaDto> getAll() throws Exception {

        return converter.convert(repo.findAll());
    }

    @Override
    public List<CompetenciaDto> filter(CompetenciaFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(UUID id) {
        repo.deleteById(id);

    }


}
