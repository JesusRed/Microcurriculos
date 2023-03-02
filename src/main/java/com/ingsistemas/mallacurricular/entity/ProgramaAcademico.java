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
        String ID_PROGRAMA = "idPrograma";
        String NOMBRE = "nombre";
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

    public ProgramaAcademico() {
    }

    public UUID getIdPrograma() {
        return this.idPrograma;
    }

    public void setIdPrograma(UUID idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pensum> getPensums() {
        return this.pensums;
    }

    public void setPensums(List<Pensum> pensums) {
        this.pensums = pensums;
    }

    public Pensum addPensum(Pensum pensum) {
        getPensums().add(pensum);
        pensum.setProgramaAcademico(this);

        return pensum;
    }

    public Pensum removePensum(Pensum pensum) {
        getPensums().remove(pensum);
        pensum.setProgramaAcademico(null);

        return pensum;
    }

    public Persona getPersona() {
        return this.director;
    }

    public void setPersona(Persona persona) {
        this.director = persona;
    }

}