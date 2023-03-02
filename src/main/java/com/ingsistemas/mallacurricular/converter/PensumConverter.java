package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.PensumDto;
import com.ingsistemas.mallacurricular.entity.Pensum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PensumConverter implements ConverterDto<Pensum, PensumDto> {

    @Autowired
    AsignaturaConverter asiconverter;
    @Autowired
    ProgramaAcademicoConverter paconverter;

    @Override
    public List<PensumDto> convert(List<Pensum> lista) {
        List<PensumDto> result = new ArrayList<PensumDto>();
        for (Pensum pensum : lista) {
            result.add(convert(pensum));
        }
        return result;
    }

    @Override
    public PensumDto convert(Pensum entidad) {
        PensumDto dto = new PensumDto();
        dto.setCreditosTotales(entidad.getCreditosTotales());
        dto.setFechaInicio(entidad.getFechaInicio());
        dto.setId(entidad.getIdPensum());
        dto.setAsignaturas(asiconverter.convert(entidad.getAsignaturas()));
        dto.setStatus(entidad.isStatus());
        dto.setFechFin(entidad.getFechaFinal());
        dto.setProgramaAcademico(paconverter.convert(entidad.getProgramaAcademico()));
        return dto;
    }


}
