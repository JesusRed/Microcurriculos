package com.ingsistemas.mallacurricular.daoImpl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

@Repository
public class GenericDaoImpl<T extends Serializable, E> {
    @PersistenceContext
    protected EntityManager entityManager;

    @Transactional
    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Transactional
    public T update(T entity) {
        entityManager.merge(entity);
        return entity;

    }

}
