package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.PersonaDtoConverter;
import com.ingsistemas.mallacurricular.dto.PersonaDto;
import com.ingsistemas.mallacurricular.dto.ProgramaAcademicoDto;
import com.ingsistemas.mallacurricular.entity.Persona;
import com.ingsistemas.mallacurricular.entity.ProgramaAcademico;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.filters.PersonaFilter;
import com.ingsistemas.mallacurricular.repository.PersonaRepository;
import com.ingsistemas.mallacurricular.repository.ProgramaAcademicoRepository;
import com.ingsistemas.mallacurricular.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The type Persona service.
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    /**
     * The Dao.
     */
    @Autowired
    PersonaRepository dao;
    /**
     * The Converter.
     */
    @Autowired
    PersonaDtoConverter converter;
    @Autowired
    ProgramaAcademicoRepository programaAcademicoRepository;

    @Override
    public PersonaDto crearOActualizar(PersonaDto entidad) {
        //System.out.println("listota: "+ entidad.getProgramaAcademicos());
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
        // find by programa academico por id y hacer la lista
        //p.setProgramaAcademicos(entidad.getProgramaAcademicos());
        List<ProgramaAcademico> programaAcademicos = new ArrayList<>();
        for (ProgramaAcademicoDto programaAcademicoDto : entidad.getProgramaAcademicos()) {
            ProgramaAcademico programaAcademico = programaAcademicoRepository.findById(programaAcademicoDto.getIdPrograma()).get();
                programaAcademicos.add(programaAcademico);
            }
        if (programaAcademicos.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Programa Academico no encontrado", entidad.getProgramaAcademicos().toString());
        } else {
            p.setProgramaAcademicos(programaAcademicos);
        }

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

    /**
     * Cambiar permiso.
     *
     * @param id the id
     */
    public void cambiarPermiso(Integer id) {

        Optional<Persona> opersona = dao.findById(id);
        if (opersona.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "Persona", id.toString());
        }
        opersona.get().setStatus(!opersona.get().isStatus());
        dao.save(opersona.get());
    }


}
