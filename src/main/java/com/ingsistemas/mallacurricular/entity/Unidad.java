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

    /**
     * Instantiates a new Unidad.
     */
    public Unidad() {
    }

    /**
     * Gets id unidad.
     *
     * @return the id unidad
     */
    public UUID getIdUnidad() {
        return this.idUnidad;
    }

    /**
     * Sets id unidad.
     *
     * @param idUnidad the id unidad
     */
    public void setIdUnidad(UUID idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Gets had.
     *
     * @return the had
     */
    public String getHad() {
        return this.had;
    }

    /**
     * Sets had.
     *
     * @param had the had
     */
    public void setHad(String had) {
        this.had = had;
    }

    /**
     * Gets hti.
     *
     * @return the hti
     */
    public String getHti() {
        return this.hti;
    }

    /**
     * Sets hti.
     *
     * @param hti the hti
     */
    public void setHti(String hti) {
        this.hti = hti;
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

    /**
     * Gets temas.
     *
     * @return the temas
     */
    public List<Tema> getTemas() {
        return this.temas;
    }

    /**
     * Sets temas.
     *
     * @param temas the temas
     */
    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    /**
     * Add tema tema.
     *
     * @param tema the tema
     * @return the tema
     */
    public Tema addTema(Tema tema) {
        getTemas().add(tema);
        tema.setUnidad(this);

        return tema;
    }

    /**
     * Remove tema tema.
     *
     * @param tema the tema
     * @return the tema
     */
    public Tema removeTema(Tema tema) {
        getTemas().remove(tema);
        tema.setUnidad(null);

        return tema;
    }

    /**
     * Gets asignatura.
     *
     * @return the asignatura
     */
    public Asignatura getAsignatura() {
        return this.asignatura;
    }

    /**
     * Sets asignatura.
     *
     * @param asignatura the asignatura
     */
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

}