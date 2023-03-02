package com.ingsistemas.mallacurricular.entity;

import com.ingsistemas.mallacurricular.converter.UUIDConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;


/**
 * The persistent class for the tema database table.
 */
@Entity
@NamedQuery(name = "Tema.findAll", query = "SELECT t FROM Tema t")
public class Tema implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_tema")
    @Convert(converter = UUIDConverter.class)
    private UUID idTema;

    private String nombre;

    //bi-directional many-to-one association to Subtema
    @OneToMany(mappedBy = "tema", fetch = FetchType.EAGER)
    private List<Subtema> subtemas;

    //bi-directional many-to-one association to Unidad
    @ManyToOne
    @JoinColumn(name = "id_unidad")
    private Unidad unidad;

    public Tema() {
    }

    public UUID getIdTema() {
        return this.idTema;
    }

    public void setIdTema(UUID idTema) {
        this.idTema = idTema;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Subtema> getSubtemas() {
        return this.subtemas;
    }

    public void setSubtemas(List<Subtema> subtemas) {
        this.subtemas = subtemas;
    }

    public Subtema addSubtema(Subtema subtema) {
        getSubtemas().add(subtema);
        subtema.setTema(this);

        return subtema;
    }

    public Subtema removeSubtema(Subtema subtema) {
        getSubtemas().remove(subtema);
        subtema.setTema(null);

        return subtema;
    }

    public Unidad getUnidad() {
        return this.unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

}