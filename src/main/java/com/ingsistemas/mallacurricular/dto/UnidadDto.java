package com.ingsistemas.mallacurricular.dto;

import java.util.List;
import java.util.UUID;

/**
 * The type Unidad dto.
 */
public class UnidadDto {


    private UUID idUnidad;

    private String had;

    private String hti;

    private String nombre;


    private List<TemaDto> temas;

    private AsignaturaDto asignatura;

    /**
     * Gets id unidad.
     *
     * @return the id unidad
     */
    public UUID getIdUnidad() {
        return idUnidad;
    }

    /**
     * Sets id unidad.
     *
     * @param idUnidad the id unidad
     */
    public void setIdUnidad(UUID idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Gets had.
     *
     * @return the had
     */
    public String getHad() {
        return had;
    }

    /**
     * Sets had.
     *
     * @param had the had
     */
    public void setHad(String had) {
        this.had = had;
    }

    /**
     * Gets hti.
     *
     * @return the hti
     */
    public String getHti() {
        return hti;
    }

    /**
     * Sets hti.
     *
     * @param hti the hti
     */
    public void setHti(String hti) {
        this.hti = hti;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets temas.
     *
     * @return the temas
     */
    public List<TemaDto> getTemas() {
        return temas;
    }

    /**
     * Sets temas.
     *
     * @param temas the temas
     */
    public void setTemas(List<TemaDto> temas) {
        this.temas = temas;
    }

    /**
     * Gets asignatura.
     *
     * @return the asignatura
     */
    public AsignaturaDto getAsignatura() {
        return asignatura;
    }

    /**
     * Sets asignatura.
     *
     * @param asignatura the asignatura
     */
    public void setAsignatura(AsignaturaDto asignatura) {
        this.asignatura = asignatura;
    }


}
