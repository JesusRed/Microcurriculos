package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

public class ResultadoAprendizajeDto {
    private UUID idResultado;

    private String descripcion;

    private String nombre;

    public UUID getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(UUID idResultado) {
        this.idResultado = idResultado;
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
