package com.ingsistemas.mallacurricular.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * The interface Controller generic.
 *
 * @param <U> the type parameter
 * @param <T> the type parameter
 */
public interface ControllerGeneric<U, T> {
    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     * @throws Exception the exception
     */
    @GetMapping("/getById")
    ResponseEntity<U> getById(T id) throws Exception;

    /**
     * Gets all.
     *
     * @return the all
     * @throws Exception the exception
     */
    @GetMapping("/getAll")
    ResponseEntity<List<U>> getAll() throws Exception;

    /**
     * Crear o actualizar response entity.
     *
     * @param dto the dto
     * @return the response entity
     * @throws Exception the exception
     */
    @PostMapping("/save")
    ResponseEntity<U> crearOActualizar(U dto) throws Exception;

    /**
     * Eliminar.
     *
     * @param UUID the uuid
     * @throws Exception the exception
     */
    @DeleteMapping("/delete")
    void eliminar(T UUID) throws Exception;
}
