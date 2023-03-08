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

    /**
     * Instantiates a new Resultado aprendizaje.
     */
    public ResultadoAprendizaje() {
    }

    /**
     * Gets id resultado.
     *
     * @return the id resultado
     */
    public UUID getIdResultado() {
        return this.idResultado;
    }

    /**
     * Sets id resultado.
     *
     * @param idResultado the id resultado
     */
    public void setIdResultado(UUID idResultado) {
        this.idResultado = idResultado;
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