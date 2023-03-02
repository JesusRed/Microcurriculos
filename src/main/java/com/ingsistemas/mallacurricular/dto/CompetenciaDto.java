package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

public class CompetenciaDto {
    private UUID idCompetencia;

    private String descripcion;

    private String nombre;

    public UUID getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(UUID idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
