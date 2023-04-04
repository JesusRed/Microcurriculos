package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.AreaFormacionConverter;
import com.ingsistemas.mallacurricular.dto.AreaFormacionDto;
import com.ingsistemas.mallacurricular.entity.AreaFormacion;
import com.ingsistemas.mallacurricular.filters.AreaFormacionFilter;
import com.ingsistemas.mallacurricular.repository.AreaFormacionRepository;
import com.ingsistemas.mallacurricular.service.AreaFormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * The type Area formacion service.
 */
@Service
public class AreaFormacionServiceImpl implements AreaFormacionService {
    /**
     * The Converter.
     */
    @Autowired
    AreaFormacionConverter converter;
    /**
     * The Repo.
     */
    @Autowired
    AreaFormacionRepository repo;

    @Override
    public AreaFormacionDto crearOActualizar(AreaFormacionDto entidad) throws Exception {
        AreaFormacion area = new AreaFormacion();
        area.setIdAreaFormacion(entidad.getIdAreaFormacion());
        area.setNombre(entidad.getNombre());
        return converter.convert(repo.save(area));
    }

    @SuppressWarnings("deprecation")
    @Override
    public AreaFormacionDto getOne(UUID id) throws Exception {
        // TODO Auto-generated method stub
        return converter.convert(repo.getOne(id));
    }

    @Override
    public List<AreaFormacionDto> getAll() throws Exception {
        return converter.convert(repo.findAll());
    }

    @Override
    public List<AreaFormacionDto> filter(AreaFormacionFilter filter) throws Exception {
        return converter.convert(repo.filter(filter));
    }

    @Override
    public void eliminar(UUID id) {
        AreaFormacion a = new AreaFormacion();
        a.setIdAreaFormacion(id);
        repo.delete(a);

    }


}
