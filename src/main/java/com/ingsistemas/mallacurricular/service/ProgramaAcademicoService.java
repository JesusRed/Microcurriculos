package com.ingsistemas.mallacurricular.service;

import com.ingsistemas.mallacurricular.dto.ProgramaAcademicoDto;
import com.ingsistemas.mallacurricular.filters.ProgramaAcademicoFilter;

import java.util.List;
import java.util.UUID;

/**
 * The interface Programa academico service.
 */
public interface ProgramaAcademicoService extends GenericService<ProgramaAcademicoDto, UUID, ProgramaAcademicoFilter> {
    /**
     * Filtrar por director list.
     *
     * @param docenteId the docente id
     * @return the list
     */
    List<ProgramaAcademicoDto> filtrarPorDirector(Integer docenteId);

    /**
     * Filtrar por nombre list.
     *
     * @param nombre the nombre
     * @return the list
     */
    List<ProgramaAcademicoDto> filtrarPorNombre(String nombre);
}
