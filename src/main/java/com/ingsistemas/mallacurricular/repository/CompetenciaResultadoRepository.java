package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.CompetenciaResultado;
import com.ingsistemas.mallacurricular.entity.CompetenciaResultadoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Competencia resultado repository.
 */
@Repository
public interface CompetenciaResultadoRepository extends JpaRepository<CompetenciaResultado, CompetenciaResultadoPK> {

}
