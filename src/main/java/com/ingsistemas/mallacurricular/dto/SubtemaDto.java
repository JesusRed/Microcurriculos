package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

public class SubtemaDto {
    private UUID idSubtema;

    private String nombre;

    private TemaDto tema;

    public UUID getIdSubtema() {
        return idSubtema;
    }

    public void setIdSubtema(UUID idSubtema) {
        this.idSubtema = idSubtema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TemaDto getTema() {
        return tema;
    }

    public void setTema(TemaDto tema) {
        this.tema = tema;
    }

}
