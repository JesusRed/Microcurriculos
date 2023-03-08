package com.ingsistemas.mallacurricular.entity;

import com.ingsistemas.mallacurricular.converter.UUIDConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


/**
 * The persistent class for the area_formacion database table.
 */
@Entity
@Table(name = "area_formacion")
@NamedQuery(name = "AreaFormacion.findAll", query = "SELECT a FROM AreaFormacion a")
public class AreaFormacion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Convert(converter = UUIDConverter.class)
    private UUID idAreaFormacion;
    @Column(name = "nombre")
    private String nombre;

    /**
     * Instantiates a new Area formacion.
     */
    public AreaFormacion() {
    }

    /**
     * Gets id area formacion.
     *
     * @return the id area formacion
     */
    public UUID getIdAreaFormacion() {
        return this.idAreaFormacion;
    }

    /**
     * Sets id area formacion.
     *
     * @param idAreaFormacion the id area formacion
     */
    public void setIdAreaFormacion(UUID idAreaFormacion) {
        this.idAreaFormacion = idAreaFormacion;
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