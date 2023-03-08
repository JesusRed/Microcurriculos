package com.ingsistemas.mallacurricular.service;

import com.ingsistemas.mallacurricular.filters.MasterFilter;

import java.util.List;

/**
 * The interface Generic service.
 *
 * @param <T> the type parameter
 * @param <P> the type parameter
 * @param <V> the type parameter
 */
public interface GenericService<T, P, V extends MasterFilter> {
    /**
     * Crear o actualizar t.
     *
     * @param entidad the entidad
     * @return the t
     * @throws Exception the exception
     */
    T crearOActualizar(T entidad) throws Exception;

    /**
     * Gets one.
     *
     * @param id the id
     * @return the one
     * @throws Exception the exception
     */
    T getOne(P id) throws Exception;

    /**
     * Gets all.
     *
     * @return the all
     * @throws Exception the exception
     */
    List<T> getAll() throws Exception;

    /**
     * Filter list.
     *
     * @param filter the filter
     * @return the list
     * @throws Exception the exception
     */
    List<T> filter(V filter) throws Exception;

    /**
     * Eliminar.
     *
     * @param id the id
     */
    void eliminar(P id);
}
