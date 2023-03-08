package com.ingsistemas.mallacurricular.dto;

import java.util.Date;
import java.util.List;

/**
 * The type Pensum dto.
 */
public class PensumDto {
    /**
     * The Id.
     */
    Integer id;


    private Integer creditosTotales;


    private Date fechaInicio;

    private Date fechFin;

    private ProgramaAcademicoDto programaAcademico;

    private List<AsignaturaDto> asignaturas;

    private boolean status;

    /**
     * Gets creditos totales.
     *
     * @return the creditos totales
     */
    public Integer getCreditosTotales() {
        return creditosTotales;
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
        return fechaInicio;
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
     * Gets programa academico.
     *
     * @return the programa academico
     */
    public ProgramaAcademicoDto getProgramaAcademico() {
        return programaAcademico;
    }

    /**
     * Sets programa academico.
     *
     * @param programaAcademico the programa academico
     */
    public void setProgramaAcademico(ProgramaAcademicoDto programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    /**
     * Gets asignaturas.
     *
     * @return the asignaturas
     */
    public List<AsignaturaDto> getAsignaturas() {
        return asignaturas;
    }

    /**
     * Sets asignaturas.
     *
     * @param asignaturas the asignaturas
     */
    public void setAsignaturas(List<AsignaturaDto> asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
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

    /**
     * Gets fech fin.
     *
     * @return the fech fin
     */
    public Date getFechFin() {
        return fechFin;
    }

    /**
     * Sets fech fin.
     *
     * @param fechFin the fech fin
     */
    public void setFechFin(Date fechFin) {
        this.fechFin = fechFin;
    }

}
