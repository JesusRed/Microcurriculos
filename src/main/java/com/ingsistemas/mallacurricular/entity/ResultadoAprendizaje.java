package com.ingsistemas.mallacurricular.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


/**
 * The persistent class for the resultado_aprendizaje database table.
 */
@Entity
@Table(name = "resultado_aprendizaje")
@NamedQuery(name = "ResultadoAprendizaje.findAll", query = "SELECT r FROM ResultadoAprendizaje r")
public class ResultadoAprendizaje implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_resultado")
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID idResultado;

    private String descripcion;

    private String nombre;

    public ResultadoAprendizaje() {
    }

    public UUID getIdResultado() {
        return this.idResultado;
    }

    public void setIdResultado(UUID idResultado) {
        this.idResultado = idResultado;
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