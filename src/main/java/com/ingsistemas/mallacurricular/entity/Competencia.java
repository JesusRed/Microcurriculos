package com.ingsistemas.mallacurricular.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.io.Serializable;
import java.util.UUID;


/**
 * The persistent class for the competencia database table.
 */
@Entity
@NamedQuery(name = "Competencia.findAll", query = "SELECT c FROM Competencia c")
public class Competencia implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id_competencia")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Id
    private UUID idCompetencia;

    private String descripcion;

    private String nombre;

    public Competencia() {
    }

    public UUID getIdCompetencia() {
        return this.idCompetencia;
    }

    public void setIdCompetencia(UUID idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}