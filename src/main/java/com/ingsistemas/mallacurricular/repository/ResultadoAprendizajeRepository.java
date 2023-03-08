package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.entity.ResultadoAprendizaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * The interface Resultado aprendizaje repository.
 */
public interface ResultadoAprendizajeRepository extends JpaRepository<ResultadoAprendizaje, UUID> {

}
