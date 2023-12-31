package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.Subtema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * The interface Sub tema repository.
 */
@Repository
public interface SubTemaRepository extends JpaRepository<Subtema, UUID> {

}
