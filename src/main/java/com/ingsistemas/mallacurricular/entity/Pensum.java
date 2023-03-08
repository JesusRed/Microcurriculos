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
    @JoinTable(name = "pensum_asignatura", joinColumns = {@JoinColumn(name = "id_pensum")}, inverseJoinColumns = {@JoinColumn(name = "codigo_asignatura")})
    private List<Asignatura> asignaturas;

    /**
     * Instantiates a new Pensum.
     */
    public Pensum() {
    }

    /**
     * Gets id pensum.
     *
     * @return the id pensum
     */
    public Integer getIdPensum() {
        return this.idPensum;
    }

    /**
     * Sets id pensum.
     *
     * @param idPensum the id pensum
     */
    public void setIdPensum(Integer idPensum) {
        this.idPensum = idPensum;
    }

    /**
     * Gets creditos totales.
     *
     * @return the creditos totales
     */
    public Integer getCreditosTotales() {
        return this.creditosTotales;
    }

    /**
     * Sets creditos totales.
     *
     * @param creditosTotales the creditos totales
     */
    public void setCreditosTotales(Integer creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    /**
     * Gets fecha inicio.
     *
     * @return the fecha inicio
     */
    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    /**
     * Sets fecha inicio.
     *
     * @param fechaInicio the fecha inicio
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets fecha final.
     *
     * @return the fecha final
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Sets fecha final.
     *
     * @param fechaFinal the fecha final
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * Gets programa academico.
     *
     * @return the programa academico
     */
    public ProgramaAcademico getProgramaAcademico() {
        return this.programaAcademico;
    }

    /**
     * Sets programa academico.
     *
     * @param programaAcademico the programa academico
     */
    public void setProgramaAcademico(ProgramaAcademico programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    /**
     * Gets asignaturas.
     *
     * @return the asignaturas
     */
    public List<Asignatura> getAsignaturas() {
        return this.asignaturas;
    }

    /**
     * Sets asignaturas.
     *
     * @param asignaturas the asignaturas
     */
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * Is status boolean.
     *
     * @return the boolean
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

}