package com.ingsistemas.mallacurricular.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PropiedadFaltanteException extends ResponseStatusException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String entidad;
    private String nombrePropiedad;

    public PropiedadFaltanteException(ErrorsEnum error, String entidad, String nombrePropiedad) {
        super(HttpStatus.BAD_REQUEST, error.getMensaje());
        this.entidad = entidad;


    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getNombrePropiedad() {
        return nombrePropiedad;
    }

    public void setNombrePropiedad(String nombrePropiedad) {
        this.nombrePropiedad = nombrePropiedad;
    }

    @Override
    public String toString() {
        return "PropiedadFaltanteException [entidad=" + entidad + ", nombrePropiedad=" + nombrePropiedad + "]";
    }


}