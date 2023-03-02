package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.ProgramaAcademico;

import java.util.List;

public interface ProgramaAcademicoDao {
    List<ProgramaAcademico> getByDirector(Integer id);

    List<ProgramaAcademico> getByNombre(String nombre);
}
