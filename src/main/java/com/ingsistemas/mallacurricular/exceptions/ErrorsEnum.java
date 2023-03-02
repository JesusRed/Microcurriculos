package com.ingsistemas.mallacurricular.exceptions;

public enum ErrorsEnum {

    NOT_FOUND("NOT_FOUND", "no se ha encontrado entidad con el idProporcionado"),
    NOT_FOUND_DIRECTOR("NOT_FOUND", "no se ha encontrado un director con el idProporcionado"),
    MISSING_PROPERTY("BAD_GATEWAY", "no se ha encontrado una o mas propiedades necesarias para la insercion o actualizacion de la entidad"),
    NOT_AUTHORITY("FORBIDEN", "no es posible ejecutar esta accion con este tipo de usuario");

    private String codigoError;
    private String mensaje;

    private ErrorsEnum(String codigoError, String mensaje) {
        this.codigoError = codigoError;
        this.mensaje = mensaje;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
