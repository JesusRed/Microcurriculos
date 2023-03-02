package com.ingsistemas.mallacurricular.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ElementoNoEncontradoException extends ResponseStatusException {
    private String entidad;
    private String id;

    public ElementoNoEncontradoException(ErrorsEnum error, String entidad, String id) {
        super(HttpStatus.NOT_FOUND, error.getMensaje());
        this.entidad = entidad;
        this.id = id;

    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}