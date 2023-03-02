package com.ingsistemas.mallacurricular.service;

import com.ingsistemas.mallacurricular.dto.AsignaturaDto;
import com.ingsistemas.mallacurricular.filters.AsignaturaFilter;
import net.sf.jasperreports.engine.JRException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface AsignaturaService extends GenericService<AsignaturaDto, Integer, AsignaturaFilter> {
    void alternarDescarga(Integer id);

    byte[] imprimir(Integer id) throws FileNotFoundException, JRException, IOException;
}
