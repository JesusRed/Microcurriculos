package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.UnidadDto;
import com.ingsistemas.mallacurricular.entity.Unidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Unidad converter.
 */
@Component
public class UnidadConverter implements ConverterDto<Unidad, UnidadDto> {
    /**
     * The Temasconverter.
     */
    @Autowired
    TemaConverter temasconverter;

    @Override
    public List<UnidadDto> convert(List<Unidad> lista) {
        List<UnidadDto> result = new ArrayList<UnidadDto>();
        for (Unidad unidad : lista) {
            result.add(convert(unidad));
        }
        return result;
    }

    @Override
    public UnidadDto convert(Unidad entidad) {
        UnidadDto dto = new UnidadDto();
        dto.setHad(entidad.getHad());
        dto.setHti(entidad.getHti());
        dto.setIdUnidad(entidad.getIdUnidad());
        dto.setNombre(entidad.getNombre());
        dto.setTemas(temasconverter.convert(entidad.getTemas()));
        return dto;
    }

}
