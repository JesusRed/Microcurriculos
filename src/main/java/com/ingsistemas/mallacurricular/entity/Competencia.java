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

    /**
     * Instantiates a new Competencia.
     */
    public Competencia() {
    }

    /**
     * Gets id competencia.
     *
     * @return the id competencia
     */
    public UUID getIdCompetencia() {
        return this.idCompetencia;
    }

    /**
     * Sets id competencia.
     *
     * @param idCompetencia the id competencia
     */
    public void setIdCompetencia(UUID idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    /**
     * Gets descripcion.
     *
     * @return the descripcion
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Sets descripcion.
     *
     * @param descripcion the descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}