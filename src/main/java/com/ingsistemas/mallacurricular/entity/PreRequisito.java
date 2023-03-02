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

    public PreRequisito() {
    }

    public UUID getIdPreRequisito() {
        return this.idPreRequisito;
    }

    public void setIdPreRequisito(UUID idPreRequisito) {
        this.idPreRequisito = idPreRequisito;
    }

    public String getCredito() {
        return this.credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public Integer getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Integer asignatura) {
        this.asignatura = asignatura;
    }


}