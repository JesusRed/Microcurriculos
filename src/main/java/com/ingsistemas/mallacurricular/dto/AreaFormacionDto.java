package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

public class AreaFormacionDto {
    private UUID idAreaFormacion;

    private String nombre;

    public UUID getIdAreaFormacion() {
        return idAreaFormacion;
    }

    public void setIdAreaFormacion(UUID idAreaFormacion) {
        this.idAreaFormacion = idAreaFormacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
