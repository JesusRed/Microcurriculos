package com.ingsistemas.mallacurricular.dao;

import com.ingsistemas.mallacurricular.entity.AreaFormacion;
import com.ingsistemas.mallacurricular.filters.AreaFormacionFilter;

import java.util.List;

public interface AreaFormacionDao {
    List<AreaFormacion> filter(AreaFormacionFilter filter);
}
