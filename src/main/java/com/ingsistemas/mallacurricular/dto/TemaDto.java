package com.ingsistemas.mallacurricular.dto;

import java.util.List;
import java.util.UUID;

/**
 * The type Tema dto.
 */
public class TemaDto {

    private UUID idTema;

    private String nombre;


    private List<SubtemaDto> subtemas;

    private UnidadDto unidad;

    /**
     * Gets id tema.
     *
     * @return the id tema
     */
    public UUID getIdTema() {
        return idTema;
    }

    /**
     * Sets id tema.
     *
     * @param idTema the id tema
     */
    public void setIdTema(UUID idTema) {
        this.idTema = idTema;
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
     * Gets subtemas.
     *
     * @return the subtemas
     */
    public List<SubtemaDto> getSubtemas() {
        return subtemas;
    }

    /**
     * Sets subtemas.
     *
     * @param subtemas the subtemas
     */
    public void setSubtemas(List<SubtemaDto> subtemas) {
        this.subtemas = subtemas;
    }

    /**
     * Gets unidad.
     *
     * @return the unidad
     */
    public UnidadDto getUnidad() {
        return unidad;
    }

    /**
     * Sets unidad.
     *
     * @param unidad the unidad
     */
    public void setUnidad(UnidadDto unidad) {
        this.unidad = unidad;
    }


}
