package com.ingsistemas.mallacurricular.dto;

import java.util.List;
import java.util.UUID;

public class TemaDto {

    private UUID idTema;

    private String nombre;


    private List<SubtemaDto> subtemas;

    private UnidadDto unidad;

    public UUID getIdTema() {
        return idTema;
    }

    public void setIdTema(UUID idTema) {
        this.idTema = idTema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<SubtemaDto> getSubtemas() {
        return subtemas;
    }

    public void setSubtemas(List<SubtemaDto> subtemas) {
        this.subtemas = subtemas;
    }

    public UnidadDto getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDto unidad) {
        this.unidad = unidad;
    }


}
