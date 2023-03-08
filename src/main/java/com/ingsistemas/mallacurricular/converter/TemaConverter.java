package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.TemaDto;
import com.ingsistemas.mallacurricular.entity.Tema;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Tema converter.
 */
@Component
public class TemaConverter implements ConverterDto<Tema, TemaDto> {
    /**
     * The Unidad converter.
     */
    UnidadConverter unidadConverter;
    /**
     * The Sub converter.
     */
    SubTemaConverter subConverter;

    @Override
    public List<TemaDto> convert(List<Tema> lista) {
        List<TemaDto> result = new ArrayList<TemaDto>();
        for (Tema tema : lista) {
            result.add(convert(tema));
        }
        return result;
    }

    @Override
    public TemaDto convert(Tema entidad) {
        TemaDto dto = new TemaDto();
        dto.setNombre(entidad.getNombre());
        dto.setIdTema(entidad.getIdTema());
        //dto.setUnidad(unidadConverter.convert(entidad.getUnidad()));
        dto.setSubtemas(subConverter.convert(entidad.getSubtemas()));
        return dto;
    }

}
