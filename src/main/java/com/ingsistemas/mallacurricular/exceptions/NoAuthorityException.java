package com.ingsistemas.mallacurricular.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * The type No authority exception.
 */
public class NoAuthorityException extends ResponseStatusException {

    /**
     *
     */

    private static final long serialVersionUID = 1L;
    private String operacion;
    private String id;

    /**
     * Instantiates a new No authority exception.
     *
     * @param operacion the operacion
     * @param id        the id
     */
    public NoAuthorityException(String operacion, String id) {
        super(HttpStatus.BAD_REQUEST, ErrorsEnum.NOT_AUTHORITY.getMensaje());
        this.setOperacion(operacion);
        this.setId(id);


    }


    /**
     * Gets operacion.
     *
     * @return the operacion
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets operacion.
     *
     * @param operacion the operacion
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
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
