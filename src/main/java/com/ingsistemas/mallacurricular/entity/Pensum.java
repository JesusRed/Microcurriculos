package com.ingsistemas.mallacurricular.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pensum database table.
 */
@Entity
@NamedQuery(name = "Pensum.findAll", query = "SELECT p FROM Pensum p")
public class Pensum implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_pensum")
    private Integer idPensum;

    @Column(name = "creditos_totales")
    private Integer creditosTotales;


    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fin")
    private Date fechaFinal;
    @Column(name = "status")
    private boolean status;

    //bi-directional many-to-one association to ProgramaAcademico
    @ManyToOne
    @JoinColumn(name = "id_programa")
    private ProgramaAcademico programaAcademico;

    //bi-directional many-to-many association to Asignatura
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pensum_asignatura"
            , joinColumns = {
            @JoinColumn(name = "id_pensum")
    }
            , inverseJoinColumns = {
            @JoinColumn(name = "codigo_asignatura")
    }
    )
    private List<Asignatura> asignaturas;

    public Pensum() {
    }

    public Integer getIdPensum() {
        return this.idPensum;
    }

    public void setIdPensum(Integer idPensum) {
        this.idPensum = idPensum;
    }

    public Integer getCreditosTotales() {
        return this.creditosTotales;
    }

    public void setCreditosTotales(Integer creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ProgramaAcademico getProgramaAcademico() {
        return this.programaAcademico;
    }

    public void setProgramaAcademico(ProgramaAcademico programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public List<Asignatura> getAsignaturas() {
        return this.asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}