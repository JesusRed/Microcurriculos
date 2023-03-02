package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.PersonaDtoConverter;
import com.ingsistemas.mallacurricular.dto.PersonaDto;
import com.ingsistemas.mallacurricular.entity.Persona;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.filters.PersonaFilter;
import com.ingsistemas.mallacurricular.repository.PersonaRepository;
import com.ingsistemas.mallacurricular.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository dao;
    @Autowired
    PersonaDtoConverter converter;

    @Override
    public PersonaDto crearOActualizar(PersonaDto entidad) {
        Persona p = new Persona();
        p.setCodigo(entidad.getCodigo());
        p.setAdministrador(entidad.isAdministrador());
        p.setCorreoElectronico(entidad.getCorreoElectronico());
        try {
            p.setStatus(entidad.isStatus());
        } catch (NullPointerException e) {
            p.setStatus(true);
        }
        p.setNombres(entidad.getNombres());
        return converter.convert(dao.save(p));

    }

    @Override
    public List<PersonaDto> getAll() throws Exception {

        return converter.convert(dao.findAll());
    }

    @Override
    public List<PersonaDto> filter(PersonaFilter filter) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PersonaDto getOne(Integer id) throws Exception {
        Optional<Persona> opersona = dao.findById(id);

        if (opersona.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Persona", id.toString());
        }
        PersonaDto p = converter.convert(dao.findById(id).get());
        return p;
    }

    @Override
    public void eliminar(Integer id) {

        Optional<Persona> opersona = dao.findById(id);
        if (opersona.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Persona", id.toString());
        }
        opersona.get().setStatus(!opersona.get().isStatus());
        dao.save(opersona.get());
    }

    public void cambiarPermiso(Integer id) {

        Optional<Persona> opersona = dao.findById(id);
        if (opersona.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Persona", id.toString());
        }
        opersona.get().setStatus(!opersona.get().isStatus());
        dao.save(opersona.get());
    }


}
