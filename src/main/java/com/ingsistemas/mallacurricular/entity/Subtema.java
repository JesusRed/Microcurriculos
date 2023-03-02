package com.ingsistemas.mallacurricular.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


/**
 * The persistent class for the subtema database table.
 */
@Entity
@NamedQuery(name = "Subtema.findAll", query = "SELECT s FROM Subtema s")
public class Subtema implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_subtema")
    @Type(type = "org.hibernate.type.UUIDCharType")

    private UUID idSubtema;

    private String nombre;

    //bi-directional many-to-one association to Tema
    @ManyToOne
    @JoinColumn(name = "id_tema")
    private Tema tema;

    public Subtema() {
    }

    public UUID getIdSubtema() {
        return this.idSubtema;
    }

    public void setIdSubtema(UUID idSubtema) {
        this.idSubtema = idSubtema;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tema getTema() {
        return this.tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

}