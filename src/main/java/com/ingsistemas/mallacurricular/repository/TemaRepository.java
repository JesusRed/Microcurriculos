package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * The interface Tema repository.
 */
@Repository
public interface TemaRepository extends JpaRepository<Tema, UUID> {

}
