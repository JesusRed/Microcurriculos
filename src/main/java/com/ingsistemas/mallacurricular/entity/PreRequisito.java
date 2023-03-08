package com.ingsistemas.mallacurricular.entity;

import com.ingsistemas.mallacurricular.converter.UUIDConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


/**
 * The persistent class for the pre_requisito database table.
 */
@Entity
@Table(name = "pre_requisito")
@NamedQuery(name = "PreRequisito.findAll", query = "SELECT p FROM PreRequisito p")
public class PreRequisito implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id

    @Convert(converter = UUIDConverter.class)
    private UUID idPreRequisito;

    @Transient
    private Integer asignatura;


    private String credito;

    /**
     * Instantiates a new Pre requisito.
     */
    public PreRequisito() {
    }

    /**
     * Gets id pre requisito.
     *
     * @return the id pre requisito
     */
    public UUID getIdPreRequisito() {
        return this.idPreRequisito;
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
        return this.credito;
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
     * Gets asignatura.
     *
     * @return the asignatura
     */
    public Integer getAsignatura() {
        return asignatura;
    }

    /**
     * Sets asignatura.
     *
     * @param asignatura the asignatura
     */
    public void setAsignatura(Integer asignatura) {
        this.asignatura = asignatura;
    }


}