package com.ingsistemas.mallacurricular.dto;

import java.util.List;
import java.util.UUID;

public class UnidadDto {


    private UUID idUnidad;

    private String had;

    private String hti;

    private String nombre;


    private List<TemaDto> temas;

    private AsignaturaDto asignatura;

    public UUID getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(UUID idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getHad() {
        return had;
    }

    public void setHad(String had) {
        this.had = had;
    }

    public String getHti() {
        return hti;
    }

    public void setHti(String hti) {
        this.hti = hti;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TemaDto> getTemas() {
        return temas;
    }

    public void setTemas(List<TemaDto> temas) {
        this.temas = temas;
    }

    public AsignaturaDto getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AsignaturaDto asignatura) {
        this.asignatura = asignatura;
    }


}
