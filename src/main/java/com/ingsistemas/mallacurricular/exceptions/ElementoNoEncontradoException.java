package com.ingsistemas.mallacurricular.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * The type Elemento no encontrado exception.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ElementoNoEncontradoException extends ResponseStatusException {
    private String entidad;
    private String id;

    /**
     * Instantiates a new Elemento no encontrado exception.
     *
     * @param error   the error
     * @param entidad the entidad
     * @param id      the id
     */
    public ElementoNoEncontradoException(ErrorsEnum error, String entidad, String id) {
        super(HttpStatus.NOT_FOUND, error.getMensaje());
        this.entidad = entidad;
        this.id = id;

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
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

}