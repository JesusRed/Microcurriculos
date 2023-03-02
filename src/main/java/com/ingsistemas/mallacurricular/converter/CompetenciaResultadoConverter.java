package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.CompetenciaResultadoDto;
import com.ingsistemas.mallacurricular.entity.CompetenciaResultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompetenciaResultadoConverter implements ConverterDto<CompetenciaResultado, CompetenciaResultadoDto> {
    @Autowired
    CompetenciaConverter compconverter;
    @Autowired
    ResultadoAprendizajeConverter resconverter;


    @Override
    public List<CompetenciaResultadoDto> convert(List<CompetenciaResultado> lista) {
        List<CompetenciaResultadoDto> result = new ArrayList<CompetenciaResultadoDto>();
        for (CompetenciaResultado competenciaResultado : lista) {
            result.add(convert(competenciaResultado));
        }
        return result;
    }

    @Override
    public CompetenciaResultadoDto convert(CompetenciaResultado entidad) {
        CompetenciaResultadoDto dto = new CompetenciaResultadoDto();
        dto.setCompetenciaDto(entidad.getId().getIdCompetencia());
        dto.setResultadoAprendizajeDto(entidad.getId().getIdResultado());
        return dto;
    }

}
