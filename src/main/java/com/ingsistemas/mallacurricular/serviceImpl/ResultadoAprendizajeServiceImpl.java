package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.ResultadoAprendizajeConverter;
import com.ingsistemas.mallacurricular.dto.ResultadoAprendizajeDto;
import com.ingsistemas.mallacurricular.entity.ResultadoAprendizaje;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.filters.ResultadoAprendizajeFilter;
import com.ingsistemas.mallacurricular.repository.ResultadoAprendizajeRepository;
import com.ingsistemas.mallacurricular.service.ResultadoAprendizajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * The type Resultado aprendizaje service.
 */
@Service
public class ResultadoAprendizajeServiceImpl implements ResultadoAprendizajeService {

    /**
     * The Converter.
     */
    @Autowired
    ResultadoAprendizajeConverter converter;
    /**
     * The Repo.
     */
    @Autowired
    ResultadoAprendizajeRepository repo;

    @Override
    public ResultadoAprendizajeDto crearOActualizar(ResultadoAprendizajeDto entidad) throws Exception {
        ResultadoAprendizaje res = new ResultadoAprendizaje();
        if (entidad.getIdResultado() != null) {
            Optional<ResultadoAprendizaje> resop = repo.findById(entidad.getIdResultado());
            if (resop.isPresent()) {
                res = resop.get();
            } else {
                throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "resultadoAprendizaje", entidad.getIdResultado().toString());
            }
        } else {
            res.setIdResultado(UUID.randomUUID());
        }
        res.setDescripcion(entidad.getDescripcion());
        res.setNombre(entidad.getNombre());
        return converter.convert(repo.save(res));
    }

    @Override
    public ResultadoAprendizajeDto getOne(UUID id) throws Exception {
        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<ResultadoAprendizajeDto> getAll() throws Exception {
        // TODO Auto-generated method stub
        return converter.convert(repo.findAll());
    }

    @Override
    public List<ResultadoAprendizajeDto> filter(ResultadoAprendizajeFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(UUID id) {
        repo.deleteById(id);

    }

}
