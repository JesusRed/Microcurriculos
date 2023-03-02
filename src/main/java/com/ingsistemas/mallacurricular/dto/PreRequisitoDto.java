package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

public class PreRequisitoDto {
    private UUID idPreRequisito;


    private String credito;
    private Integer codigoAsignatura;

    public UUID getIdPreRequisito() {
        return idPreRequisito;
    }


    public void setIdPreRequisito(UUID idPreRequisito) {
        this.idPreRequisito = idPreRequisito;
    }


    public String getCredito() {
        return credito;
    }


    public void setCredito(String credito) {
        this.credito = credito;
    }


    public Integer getCodigoAsignatura() {
        return codigoAsignatura;
    }


    public void setCodigoAsignatura(Integer codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }


}
