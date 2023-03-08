package com.ingsistemas.mallacurricular.converter;

import java.util.List;

/**
 * The interface Converter dto.
 *
 * @param <E> the type parameter
 * @param <D> the type parameter
 */
public interface ConverterDto<E, D> {
    /**
     * Convert list.
     *
     * @param lista the lista
     * @return the list
     */
    List<D> convert(List<E> lista);

    /**
     * Convert d.
     *
     * @param entidad the entidad
     * @return the d
     */
    D convert(E entidad);

}
