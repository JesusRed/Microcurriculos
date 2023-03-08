package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

/**
 * The type Resultado aprendizaje dto.
 */
public class ResultadoAprendizajeDto {
    private UUID idResultado;

    private String descripcion;

    private String nombre;

    /**
     * Gets id resultado.
     *
     * @return the id resultado
     */
    public UUID getIdResultado() {
        return idResultado;
    }

    /**
     * Sets id resultado.
     *
     * @param idResultado the id resultado
     */
    public void setIdResultado(UUID idResultado) {
        this.idResultado = idResultado;
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
