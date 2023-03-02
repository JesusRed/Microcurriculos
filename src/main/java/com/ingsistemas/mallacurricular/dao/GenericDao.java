package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.filters.MasterFilter;

import java.util.List;

public interface GenericDao<T, E> {

    public T saveOrUpdate(T instance) throws Exception;

    public void persist(T transientInstance) throws Exception;

    public void delete(T persistentInstance) throws Exception;

    public List<T> findAll(MasterFilter filter) throws Exception;

    T findById(E id) throws Exception;

}
