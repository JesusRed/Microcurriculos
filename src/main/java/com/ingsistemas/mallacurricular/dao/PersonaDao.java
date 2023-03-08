package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.Persona;

/**
 * The interface Persona dao.
 */
public interface PersonaDao {
    /**
     * Find by correo persona.
     *
     * @param correo the correo
     * @return the persona
     */
    Persona findByCorreo(String correo);
}
