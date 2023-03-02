package com.ingsistemas.mallacurricular.converter;

import java.util.List;

public interface ConverterDto<E, D> {
    List<D> convert(List<E> lista);

    D convert(E entidad);

}
