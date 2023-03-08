package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.Pensum;
import com.ingsistemas.mallacurricular.filters.PensumFilter;

import java.util.List;

/**
 * The interface Pensum dao.
 */
public interface PensumDao {
    /**
     * Filter by fecha list.
     *
     * @param filter the filter
     * @return the list
     */
    List<Pensum> filterByFecha(PensumFilter filter);
}
