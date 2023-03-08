package com.ingsistemas.mallacurricular.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;


/**
 * The persistent class for the programa_academico database table.
 */
@Entity
@Table(name = "programa_academico")
@NamedQuery(name = "ProgramaAcademico.findAll", query = "SELECT p FROM ProgramaAcademico p")
public class ProgramaAcademico implements Serializable {
    private static final long serialVersionUID = 1L;


    private interface Attributes {
        /**
         * The constant ID_PROGRAMA.
         */
        String ID_PROGRAMA = "idPrograma";
        /**
         * The constant NOMBRE.
         */
        String NOMBRE = "nombre";
        /**
         * The constant DIRECTOR.
         */
        String DIRECTOR = "Director";
    }

    @Type(type = "pg-uuid")
    @Id
    @Column(name = "id_programa")
    private UUID idPrograma;

    private String nombre;

    //bi-directional many-to-one association to Pensum
    @OneToMany(mappedBy = "programaAcademico", fetch = FetchType.LAZY)
    private List<Pensum> pensums;

    //bi-directional many-to-one association to Persona
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona director;

    /**
     * Instantiates a new Programa academico.
     */
    public ProgramaAcademico() {
    }

    /**
     * Gets id programa.
     *
     * @return the id programa
     */
    public UUID getIdPrograma() {
        return this.idPrograma;
    }

    /**
     * Sets id programa.
     *
     * @param idPrograma the id programa
     */
    public void setIdPrograma(UUID idPrograma) {
        this.idPrograma = idPrograma;
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
     * Gets pensums.
     *
     * @return the pensums
     */
    public List<Pensum> getPensums() {
        return this.pensums;
    }

    /**
     * Sets pensums.
     *
     * @param pensums the pensums
     */
    public void setPensums(List<Pensum> pensums) {
        this.pensums = pensums;
    }

    /**
     * Add pensum pensum.
     *
     * @param pensum the pensum
     * @return the pensum
     */
    public Pensum addPensum(Pensum pensum) {
        getPensums().add(pensum);
        pensum.setProgramaAcademico(this);

        return pensum;
    }

    /**
     * Remove pensum pensum.
     *
     * @param pensum the pensum
     * @return the pensum
     */
    public Pensum removePensum(Pensum pensum) {
        getPensums().remove(pensum);
        pensum.setProgramaAcademico(null);

        return pensum;
    }

    /**
     * Gets persona.
     *
     * @return the persona
     */
    public Persona getPersona() {
        return this.director;
    }

    /**
     * Sets persona.
     *
     * @param persona the persona
     */
    public void setPersona(Persona persona) {
        this.director = persona;
    }

}