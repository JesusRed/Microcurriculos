package com.ingsistemas.mallacurricular.dto;

import java.util.UUID;

/**
 * The type Area formacion dto.
 */
public class AreaFormacionDto {
    private UUID idAreaFormacion;

    private String nombre;

    /**
     * Gets id area formacion.
     *
     * @return the id area formacion
     */
    public UUID getIdAreaFormacion() {
        return idAreaFormacion;
    }

    /**
     * Sets id area formacion.
     *
     * @param idAreaFormacion the id area formacion
     */
    public void setIdAreaFormacion(UUID idAreaFormacion) {
        this.idAreaFormacion = idAreaFormacion;
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
