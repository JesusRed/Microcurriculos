package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.dao.ProgramaAcademicoDao;
import com.ingsistemas.mallacurricular.entity.ProgramaAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * The interface Programa academico repository.
 */
@Repository
public interface ProgramaAcademicoRepository extends JpaRepository<ProgramaAcademico, UUID>, ProgramaAcademicoDao {

    ProgramaAcademico findByNombre(String idPrograma);

}
