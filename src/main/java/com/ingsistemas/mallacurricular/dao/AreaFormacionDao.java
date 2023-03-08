package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.AreaFormacion;
import com.ingsistemas.mallacurricular.filters.AreaFormacionFilter;

import java.util.List;

/**
 * The interface Area formacion dao.
 */
public interface AreaFormacionDao {
    /**
     * Filter list.
     *
     * @param filter the filter
     * @return the list
     */
    List<AreaFormacion> filter(AreaFormacionFilter filter);
}
