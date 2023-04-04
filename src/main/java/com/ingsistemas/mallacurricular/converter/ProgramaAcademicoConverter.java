package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.ProgramaAcademicoDto;
import com.ingsistemas.mallacurricular.entity.ProgramaAcademico;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Programa academico converter.
 */
@Component
public class ProgramaAcademicoConverter {


    /**
     * Convert programa academico dto.
     *
     * @param entidad the entidad
     * @return the programa academico dto
     */
    public ProgramaAcademicoDto convert(ProgramaAcademico entidad) {
        ProgramaAcademicoDto dto = new ProgramaAcademicoDto();
        dto.setDirectorId(entidad.getPersona().getCodigo());
        dto.setIdPrograma(entidad.getIdPrograma());
        dto.setNombre(entidad.getNombre());
        return dto;
    }


    /**
     * Convert list.
     *
     * @param lista the lista
     * @return the list
     */
    public List<ProgramaAcademicoDto> convert(List<ProgramaAcademico> lista) {
        List<ProgramaAcademicoDto> list = new ArrayList();
        for (ProgramaAcademico dto : lista) {
            list.add(convert(dto));
        }
        return list;
    }
}
