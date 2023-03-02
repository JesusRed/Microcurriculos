package com.ingsistemas.mallacurricular.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NoAuthorityException extends ResponseStatusException {

    /**
     *
     */

    private static final long serialVersionUID = 1L;
    private String operacion;
    private String id;

    public NoAuthorityException(String operacion, String id) {
        super(HttpStatus.BAD_REQUEST, ErrorsEnum.NOT_AUTHORITY.getMensaje());
        this.setOperacion(operacion);
        this.setId(id);


    }


    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
