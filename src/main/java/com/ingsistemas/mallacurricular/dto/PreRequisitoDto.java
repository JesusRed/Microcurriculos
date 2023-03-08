package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

/**
 * The type Pre requisito dto.
 */
public class PreRequisitoDto {
    private UUID idPreRequisito;


    private String credito;
    private Integer codigoAsignatura;

    /**
     * Gets id pre requisito.
     *
     * @return the id pre requisito
     */
    public UUID getIdPreRequisito() {
        return idPreRequisito;
    }


    /**
     * Sets id pre requisito.
     *
     * @param idPreRequisito the id pre requisito
     */
    public void setIdPreRequisito(UUID idPreRequisito) {
        this.idPreRequisito = idPreRequisito;
    }


    /**
     * Gets credito.
     *
     * @return the credito
     */
    public String getCredito() {
        return credito;
    }


    /**
     * Sets credito.
     *
     * @param credito the credito
     */
    public void setCredito(String credito) {
        this.credito = credito;
    }


    /**
     * Gets codigo asignatura.
     *
     * @return the codigo asignatura
     */
    public Integer getCodigoAsignatura() {
        return codigoAsignatura;
    }


    /**
     * Sets codigo asignatura.
     *
     * @param codigoAsignatura the codigo asignatura
     */
    public void setCodigoAsignatura(Integer codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }


}
