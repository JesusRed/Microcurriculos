package com.ingsistemas.mallacurricular.entity;

import com.ingsistemas.mallacurricular.converter.UUIDConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;


/**
 * The persistent class for the unidad database table.
 */
@Entity
@NamedQuery(name = "Unidad.findAll", query = "SELECT u FROM Unidad u")
public class Unidad implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_unidad")
    @Convert(converter = UUIDConverter.class)

    private UUID idUnidad;

    private String had;

    private String hti;

    private String nombre;

    //bi-directional many-to-one association to Tema
    @OneToMany(mappedBy = "unidad", fetch = FetchType.EAGER)
    @Convert(converter = UUIDConverter.class)
    private List<Tema> temas;

    //bi-directional many-to-one association to Asignatura
    @ManyToOne
    @JoinColumn(name = "codigo_asignatura")
    private Asignatura asignatura;

    public Unidad() {
    }

    public UUID getIdUnidad() {
        return this.idUnidad;
    }

    public void setIdUnidad(UUID idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getHad() {
        return this.had;
    }

    public void setHad(String had) {
        this.had = had;
    }

    public String getHti() {
        return this.hti;
    }

    public void setHti(String hti) {
        this.hti = hti;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tema> getTemas() {
        return this.temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    public Tema addTema(Tema tema) {
        getTemas().add(tema);
        tema.setUnidad(this);

        return tema;
    }

    public Tema removeTema(Tema tema) {
        getTemas().remove(tema);
        tema.setUnidad(null);

        return tema;
    }

    public Asignatura getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

}