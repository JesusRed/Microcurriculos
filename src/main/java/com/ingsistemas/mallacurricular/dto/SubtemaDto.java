package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

/**
 * The type Subtema dto.
 */
public class SubtemaDto {
    private UUID idSubtema;

    private String nombre;

    private TemaDto tema;

    /**
     * Gets id subtema.
     *
     * @return the id subtema
     */
    public UUID getIdSubtema() {
        return idSubtema;
    }

    /**
     * Sets id subtema.
     *
     * @param idSubtema the id subtema
     */
    public void setIdSubtema(UUID idSubtema) {
        this.idSubtema = idSubtema;
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
     * Gets tema.
     *
     * @return the tema
     */
    public TemaDto getTema() {
        return tema;
    }

    /**
     * Sets tema.
     *
     * @param tema the tema
     */
    public void setTema(TemaDto tema) {
        this.tema = tema;
    }

}
