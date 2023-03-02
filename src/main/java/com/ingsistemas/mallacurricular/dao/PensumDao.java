package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.Pensum;
import com.ingsistemas.mallacurricular.filters.PensumFilter;

import java.util.List;

public interface PensumDao {
    List<Pensum> filterByFecha(PensumFilter filter);
}
