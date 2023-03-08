package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

/**
 * The type Competencia dto.
 */
public class CompetenciaDto {
    private UUID idCompetencia;

    private String descripcion;

    private String nombre;

    /**
     * Gets id competencia.
     *
     * @return the id competencia
     */
    public UUID getIdCompetencia() {
        return idCompetencia;
    }

    /**
     * Sets id competencia.
     *
     * @param idCompetencia the id competencia
     */
    public void setIdCompetencia(UUID idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    /**
     * Gets descripcion.
     *
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets descripcion.
     *
     * @param descripcion the descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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


}
