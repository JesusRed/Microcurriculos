package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Asignatura repository.
 */
@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {

}
