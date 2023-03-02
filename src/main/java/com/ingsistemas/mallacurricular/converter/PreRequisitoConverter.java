package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.PreRequisitoDto;
import com.ingsistemas.mallacurricular.entity.PreRequisito;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PreRequisitoConverter implements ConverterDto<PreRequisito, PreRequisitoDto> {

    @Override
    public List<PreRequisitoDto> convert(List<PreRequisito> lista) {
        List<PreRequisitoDto> listResult = new ArrayList<PreRequisitoDto>();
        for (PreRequisito preRequisito : lista) {
            listResult.add(convert(preRequisito));
        }
        return listResult;
    }

    @Override
    public PreRequisitoDto convert(PreRequisito entidad) {
        PreRequisitoDto dto = new PreRequisitoDto();
        dto.setCredito(entidad.getCredito());
        dto.setIdPreRequisito(entidad.getIdPreRequisito());
        if (entidad.getAsignatura() != null)
            dto.setCodigoAsignatura(entidad.getAsignatura());
        return dto;
    }

}
