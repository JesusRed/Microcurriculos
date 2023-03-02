package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

public class ProgramaAcademicoDto {
    private interface Attributes {
        String ID_PROGRAMA = "idPrograma";
        String NOMBRE = "nombre";
        String DIRECTOR = "directorId";
    }

    UUID idPrograma;
    String nombre;
    Integer directorId;

    public UUID getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(UUID idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }


}
