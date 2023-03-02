package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.Persona;

public interface PersonaDao {
    Persona findByCorreo(String correo);
}
