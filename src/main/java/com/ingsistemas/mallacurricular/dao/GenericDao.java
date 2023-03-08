package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.filters.MasterFilter;

import java.util.List;

/**
 * The interface Generic dao.
 *
 * @param <T> the type parameter
 * @param <E> the type parameter
 */
public interface GenericDao<T, E> {

    /**
     * Save or update t.
     *
     * @param instance the instance
     * @return the t
     * @throws Exception the exception
     */
    public T saveOrUpdate(T instance) throws Exception;

    /**
     * Persist.
     *
     * @param transientInstance the transient instance
     * @throws Exception the exception
     */
    public void persist(T transientInstance) throws Exception;

    /**
     * Delete.
     *
     * @param persistentInstance the persistent instance
     * @throws Exception the exception
     */
    public void delete(T persistentInstance) throws Exception;

    /**
     * Find all list.
     *
     * @param filter the filter
     * @return the list
     * @throws Exception the exception
     */
    public List<T> findAll(MasterFilter filter) throws Exception;

    /**
     * Find by id t.
     *
     * @param id the id
     * @return the t
     * @throws Exception the exception
     */
    T findById(E id) throws Exception;

}
