package com.ingsistemas.mallacurricular.daoImpl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * The type Generic dao.
 *
 * @param <T> the type parameter
 * @param <E> the type parameter
 */
@Repository
public class GenericDaoImpl<T extends Serializable, E> {
    /**
     * The Entity manager.
     */
    @PersistenceContext
    protected EntityManager entityManager;

    /**
     * Save t.
     *
     * @param entity the entity
     * @return the t
     */
    @Transactional
    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    /**
     * Update t.
     *
     * @param entity the entity
     * @return the t
     */
    @Transactional
    public T update(T entity) {
        entityManager.merge(entity);
        return entity;

    }

}
