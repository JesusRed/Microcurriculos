package com.ingsistemas.mallacurricular.service;

import com.ingsistemas.mallacurricular.dto.AsignaturaDto;
import com.ingsistemas.mallacurricular.filters.AsignaturaFilter;
import net.sf.jasperreports.engine.JRException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * The interface Asignatura service.
 */
public interface AsignaturaService extends GenericService<AsignaturaDto, Integer, AsignaturaFilter> {
    /**
     * Alternar descarga.
     *
     * @param id the id
     */
    void alternarDescarga(Integer id);

    /**
     * Imprimir byte [ ].
     *
     * @param id the id
     * @return the byte [ ]
     * @throws FileNotFoundException the file not found exception
     * @throws JRException           the jr exception
     * @throws IOException           the io exception
     */
    byte[] imprimir(Integer id) throws FileNotFoundException, JRException, IOException;
}
