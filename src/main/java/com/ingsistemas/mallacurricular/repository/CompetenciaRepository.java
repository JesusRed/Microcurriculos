package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.Competencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * The interface Competencia repository.
 */
public interface CompetenciaRepository extends JpaRepository<Competencia, UUID> {

}
