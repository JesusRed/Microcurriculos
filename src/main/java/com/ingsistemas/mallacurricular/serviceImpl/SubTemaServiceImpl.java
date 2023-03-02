package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.SubTemaConverter;
import com.ingsistemas.mallacurricular.dto.SubtemaDto;
import com.ingsistemas.mallacurricular.entity.Subtema;
import com.ingsistemas.mallacurricular.entity.Tema;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.filters.SubTemaFilter;
import com.ingsistemas.mallacurricular.repository.SubTemaRepository;
import com.ingsistemas.mallacurricular.repository.TemaRepository;
import com.ingsistemas.mallacurricular.service.SubTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SubTemaServiceImpl implements SubTemaService {
    @Autowired
    SubTemaRepository repo;
    @Autowired
    TemaRepository repoTema;
    @Autowired
    SubTemaConverter converter;

    @Override
    public SubtemaDto crearOActualizar(SubtemaDto entidad) throws Exception {
        // TODO Auto-generated method stub
        Subtema stema = new Subtema();
        if (entidad.getIdSubtema() != null) {
            if (repo.findById(entidad.getIdSubtema()).isPresent()) {
                stema = repo.findById(entidad.getIdSubtema()).get();
            } else {
                throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "subTema", entidad.getIdSubtema().toString());
            }

        } else {
            entidad.setIdSubtema(UUID.randomUUID());
        }
        stema.setNombre(entidad.getNombre());
        Optional<Tema> temaop = repoTema.findById(entidad.getIdSubtema());
        if (temaop.isPresent()) {
            stema.setTema(temaop.get());
        } else {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Tema", entidad.getTema().getIdTema().toString());
        }
        return converter.convert(repo.save(stema));
    }

    @Override
    public SubtemaDto getOne(UUID id) throws Exception {
        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<SubtemaDto> getAll() throws Exception {

        return converter.convert(repo.findAll());
    }

    @Override
    public List<SubtemaDto> filter(SubTemaFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(UUID id) {
        repo.deleteById(id);

    }


}
