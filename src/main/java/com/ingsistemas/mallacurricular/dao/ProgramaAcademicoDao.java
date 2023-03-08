package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.ProgramaAcademico;

import java.util.List;

/**
 * The interface Programa academico dao.
 */
public interface ProgramaAcademicoDao {
    /**
     * Gets by director.
     *
     * @param id the id
     * @return the by director
     */
    List<ProgramaAcademico> getByDirector(Integer id);

    /**
     * Gets by nombre.
     *
     * @param nombre the nombre
     * @return the by nombre
     */
    List<ProgramaAcademico> getByNombre(String nombre);
}
