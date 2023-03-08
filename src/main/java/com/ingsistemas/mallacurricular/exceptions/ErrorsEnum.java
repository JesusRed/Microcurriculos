package com.ingsistemas.mallacurricular.exceptions;

/**
 * The enum Errors enum.
 */
public enum ErrorsEnum {

    /**
     * The Not found.
     */
    NOT_FOUND("NOT_FOUND", "no se ha encontrado entidad con el idProporcionado"),
    /**
     * The Not found director.
     */
    NOT_FOUND_DIRECTOR("NOT_FOUND", "no se ha encontrado un director con el idProporcionado"),
    /**
     * The Missing property.
     */
    MISSING_PROPERTY("BAD_GATEWAY", "no se ha encontrado una o mas propiedades necesarias para la insercion o actualizacion de la entidad"),
    /**
     * The Not authority.
     */
    NOT_AUTHORITY("FORBIDEN", "no es posible ejecutar esta accion con este tipo de usuario");

    private String codigoError;
    private String mensaje;

    private ErrorsEnum(String codigoError, String mensaje) {
        this.codigoError = codigoError;
        this.mensaje = mensaje;
    }

    /**
     * Gets codigo error.
     *
     * @return the codigo error
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Sets codigo error.
     *
     * @param codigoError the codigo error
     */
    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    /**
     * Gets mensaje.
     *
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets mensaje.
     *
     * @param mensaje the mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
