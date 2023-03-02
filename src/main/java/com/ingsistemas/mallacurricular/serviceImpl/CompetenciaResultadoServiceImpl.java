package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.CompetenciaResultadoConverter;
import com.ingsistemas.mallacurricular.dto.CompetenciaResultadoDto;
import com.ingsistemas.mallacurricular.entity.CompetenciaResultado;
import com.ingsistemas.mallacurricular.entity.CompetenciaResultadoPK;
import com.ingsistemas.mallacurricular.filters.CompetenciaResultadoFilter;
import com.ingsistemas.mallacurricular.repository.CompetenciaResultadoRepository;
import com.ingsistemas.mallacurricular.service.CompetenciaResultadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciaResultadoServiceImpl implements CompetenciaResultadoService {
    @Autowired
    CompetenciaResultadoRepository repo;
    @Autowired
    CompetenciaResultadoConverter converter;

    @Override
    public CompetenciaResultadoDto crearOActualizar(CompetenciaResultadoDto entidad) throws Exception {
        CompetenciaResultadoPK pk = new CompetenciaResultadoPK();
        CompetenciaResultado p = new CompetenciaResultado();
        pk.setIdCompetencia(entidad.getCompetenciaDto());
        pk.setIdResultado(entidad.getResultadoAprendizajeDto());
        p.setId(pk);
        return converter.convert(repo.save(p));
    }

    @Override
    public CompetenciaResultadoDto getOne(CompetenciaResultadoPK id) throws Exception {
        // TODO Auto-generated method stub
        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<CompetenciaResultadoDto> getAll() throws Exception {
        // TODO Auto-generated method stub
        return converter.convert(repo.findAll());
    }

    @Override
    public List<CompetenciaResultadoDto> filter(CompetenciaResultadoFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(CompetenciaResultadoPK id) {
        repo.deleteById(id);

    }

}
