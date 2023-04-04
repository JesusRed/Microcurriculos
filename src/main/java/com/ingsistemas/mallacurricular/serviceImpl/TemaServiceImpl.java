package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.TemaConverter;
import com.ingsistemas.mallacurricular.dto.TemaDto;
import com.ingsistemas.mallacurricular.entity.Tema;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.filters.TemaFilter;
import com.ingsistemas.mallacurricular.repository.TemaRepository;
import com.ingsistemas.mallacurricular.repository.UnidadRepository;
import com.ingsistemas.mallacurricular.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

/**
 * The type Tema service.
 */
@Service
public class TemaServiceImpl implements TemaService {
    /**
     * The Repo.
     */
    @Autowired
    TemaRepository repo;
    /**
     * The Unirepo.
     */
    @Autowired
    UnidadRepository unirepo;
    /**
     * The Converter.
     */
    @Autowired
    TemaConverter converter;

    @Override
    public TemaDto crearOActualizar(TemaDto entidad) throws Exception {
        Tema tema = new Tema();
        if (entidad.getIdTema() != null) {
            Optional<Tema> temaop = repo.findById(entidad.getIdTema());
            if (temaop.isPresent()) {
                tema = temaop.get();
            } else {
                throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Tema", entidad.getIdTema().toString());
            }
        } else {
            tema.setIdTema(UUID.randomUUID());
        }
        tema.setNombre(entidad.getNombre());
        try {
            tema.setUnidad(unirepo.findById(entidad.getUnidad().getIdUnidad()).get());
        } catch (NoSuchElementException e) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "unidad", entidad.getUnidad().getIdUnidad().toString());
        }

        return converter.convert(repo.save(tema));
    }

    @Override
    public TemaDto getOne(UUID id) throws Exception {
        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<TemaDto> getAll() throws Exception {

        return converter.convert(repo.findAll());
    }

    @Override
    public List<TemaDto> filter(TemaFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(UUID id) {
        repo.deleteById(id);

    }

}
