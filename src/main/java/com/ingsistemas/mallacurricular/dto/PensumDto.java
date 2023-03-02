package com.ingsistemas.mallacurricular.dto;

import java.util.Date;
import java.util.List;

public class PensumDto {
    Integer id;


    private Integer creditosTotales;


    private Date fechaInicio;

    private Date fechFin;

    private ProgramaAcademicoDto programaAcademico;

    private List<AsignaturaDto> asignaturas;

    private boolean status;

    public Integer getCreditosTotales() {
        return creditosTotales;
    }

    public void setCreditosTotales(Integer creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public ProgramaAcademicoDto getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(ProgramaAcademicoDto programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public List<AsignaturaDto> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<AsignaturaDto> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getFechFin() {
        return fechFin;
    }

    public void setFechFin(Date fechFin) {
        this.fechFin = fechFin;
    }

}
