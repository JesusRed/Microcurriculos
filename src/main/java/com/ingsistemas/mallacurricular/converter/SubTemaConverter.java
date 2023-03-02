package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.SubtemaDto;
import com.ingsistemas.mallacurricular.entity.Subtema;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubTemaConverter implements ConverterDto<Subtema, SubtemaDto> {

    TemaConverter converterTema;

    @Override
    public List<SubtemaDto> convert(List<Subtema> lista) {
        List<SubtemaDto> result = new ArrayList<SubtemaDto>();
        for (Subtema subtema : lista) {
            result.add(convert(subtema));
        }
        return result;
    }

    @Override
    public SubtemaDto convert(Subtema entidad) {
        SubtemaDto dto = new SubtemaDto();
        dto.setIdSubtema(entidad.getIdSubtema());
        dto.setNombre(entidad.getNombre());
        dto.setTema(converterTema.convert(entidad.getTema()));
        return dto;
    }

}
