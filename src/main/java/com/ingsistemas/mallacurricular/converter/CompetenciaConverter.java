package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.CompetenciaDto;
import com.ingsistemas.mallacurricular.entity.Competencia;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Competencia converter.
 */
@Component
public class CompetenciaConverter implements ConverterDto<Competencia, CompetenciaDto> {

    @Override
    public List<CompetenciaDto> convert(List<Competencia> lista) {
        List<CompetenciaDto> result = new ArrayList<CompetenciaDto>();
        for (Competencia competencia : lista) {
            result.add(convert(competencia));
        }
        return result;
    }

    @Override
    public CompetenciaDto convert(Competencia entidad) {
        CompetenciaDto dto = new CompetenciaDto();
        dto.setNombre(entidad.getNombre());
        dto.setDescripcion(entidad.getDescripcion());
        dto.setIdCompetencia(entidad.getIdCompetencia());
        return dto;
    }

}
