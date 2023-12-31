package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.PreRequisito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * The interface Pre requisito repository.
 */
@Repository
public interface PreRequisitoRepository extends JpaRepository<PreRequisito, UUID> {

}
