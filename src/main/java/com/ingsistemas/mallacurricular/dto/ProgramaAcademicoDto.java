package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

/**
 * The type Programa academico dto.
 */
public class ProgramaAcademicoDto {
    private interface Attributes {
        /**
         * The constant ID_PROGRAMA.
         */
        String ID_PROGRAMA = "idPrograma";
        /**
         * The constant NOMBRE.
         */
        String NOMBRE = "nombre";
        /**
         * The constant DIRECTOR.
         */
        String DIRECTOR = "directorId";
    }

    /**
     * The Id programa.
     */
    UUID idPrograma;
    /**
     * The Nombre.
     */
    String nombre;
    /**
     * The Director id.
     */
    Integer directorId;

    /**
     * Gets id programa.
     *
     * @return the id programa
     */
    public UUID getIdPrograma() {
        return idPrograma;
    }

    /**
     * Sets id programa.
     *
     * @param idPrograma the id programa
     */
    public void setIdPrograma(UUID idPrograma) {
        this.idPrograma = idPrograma;
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
     * Gets director id.
     *
     * @return the director id
     */
    public Integer getDirectorId() {
        return directorId;
    }

    /**
     * Sets director id.
     *
     * @param directorId the director id
     */
    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }


}
