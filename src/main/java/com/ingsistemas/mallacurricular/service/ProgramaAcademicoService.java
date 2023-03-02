package com.ingsistemas.mallacurricular.service;

import com.ingsistemas.mallacurricular.dto.ProgramaAcademicoDto;
import com.ingsistemas.mallacurricular.filters.ProgramaAcademicoFilter;

import java.util.List;
import java.util.UUID;

public interface ProgramaAcademicoService extends GenericService<ProgramaAcademicoDto, UUID, ProgramaAcademicoFilter> {
    List<ProgramaAcademicoDto> filtrarPorDirector(Integer docenteId);

    List<ProgramaAcademicoDto> filtrarPorNombre(String nombre);
}
