package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * The interface Unidad repository.
 */
@Repository
public interface UnidadRepository extends JpaRepository<Unidad, UUID> {

}
