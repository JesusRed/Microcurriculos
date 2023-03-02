package com.ingsistemas.mallacurricular.service;

import com.ingsistemas.mallacurricular.filters.MasterFilter;

import java.util.List;

public interface GenericService<T, P, V extends MasterFilter> {
    T crearOActualizar(T entidad) throws Exception;

    T getOne(P id) throws Exception;

    List<T> getAll() throws Exception;

    List<T> filter(V filter) throws Exception;

    void eliminar(P id);
}
