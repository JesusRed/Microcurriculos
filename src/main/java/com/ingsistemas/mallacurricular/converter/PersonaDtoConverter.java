package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.PersonaDto;
import com.ingsistemas.mallacurricular.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Persona dto converter.
 */
@Component
public class PersonaDtoConverter implements ConverterDto<Persona, PersonaDto> {

    @Autowired
    ProgramaAcademicoConverter converter;


    @Override
    public List<PersonaDto> convert(List<Persona> lista) {
        List<PersonaDto> result = new ArrayList<PersonaDto>();
        for (Persona entity : lista) {
            result.add(convert(entity));
        }
        return result;
    }

    @Override
    public PersonaDto convert(Persona entity) {
        PersonaDto dto = new PersonaDto();
        dto.setCodigo(entity.getCodigo());
        dto.setCorreoElectronico(entity.getCorreoElectronico());
        dto.setNombres(entity.getNombres());
        dto.setProgramaAcademicos(converter.convert(entity.getProgramaAcademicos()));
        dto.setAdministrador(entity.isAdministrador());
        dto.setStatus(entity.isStatus());
        return dto;
    }


}
