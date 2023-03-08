package com.ingsistemas.mallacurricular.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * The type Propiedad faltante exception.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PropiedadFaltanteException extends ResponseStatusException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String entidad;
    private String nombrePropiedad;

    /**
     * Instantiates a new Propiedad faltante exception.
     *
     * @param error           the error
     * @param entidad         the entidad
     * @param nombrePropiedad the nombre propiedad
     */
    public PropiedadFaltanteException(ErrorsEnum error, String entidad, String nombrePropiedad) {
        super(HttpStatus.BAD_REQUEST, error.getMensaje());
        this.entidad = entidad;


    }

    /**
     * Gets entidad.
     *
     * @return the entidad
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * Sets entidad.
     *
     * @param entidad the entidad
     */
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    /**
     * Gets nombre propiedad.
     *
     * @return the nombre propiedad
     */
    public String getNombrePropiedad() {
        return nombrePropiedad;
    }

    /**
     * Sets nombre propiedad.
     *
     * @param nombrePropiedad the nombre propiedad
     */
    public void setNombrePropiedad(String nombrePropiedad) {
        this.nombrePropiedad = nombrePropiedad;
    }

    @Override
    public String toString() {
        return "PropiedadFaltanteException [entidad=" + entidad + ", nombrePropiedad=" + nombrePropiedad + "]";
    }


}