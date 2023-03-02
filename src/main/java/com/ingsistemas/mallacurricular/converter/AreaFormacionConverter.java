package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.AreaFormacionDto;
import com.ingsistemas.mallacurricular.entity.AreaFormacion;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AreaFormacionConverter implements ConverterDto<AreaFormacion, AreaFormacionDto> {

    @Override
    public List<AreaFormacionDto> convert(List<AreaFormacion> lista) {
        List<AreaFormacionDto> listaResult = new ArrayList<AreaFormacionDto>();
        for (AreaFormacion areaFormacion : lista) {
            listaResult.add(convert(areaFormacion));
        }
        return listaResult;
    }

    @Override
    public AreaFormacionDto convert(AreaFormacion entidad) {
        AreaFormacionDto dto = new AreaFormacionDto();
        dto.setIdAreaFormacion(entidad.getIdAreaFormacion());
        dto.setNombre(entidad.getNombre());
        return dto;
    }

}
