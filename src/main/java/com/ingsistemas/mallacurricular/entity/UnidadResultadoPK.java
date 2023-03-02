package com.ingsistemas.mallacurricular.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

/**
 * The primary key class for the unidad_resultado database table.
 */
@Embeddable
public class UnidadResultadoPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name = "id_unidad")
    @Type(type = "org.hibernate.type.UUIDCharType")

    private UUID idUnidad;

    @Column(name = "id_resultado")
    @Type(type = "org.hibernate.type.UUIDCharType")

    private UUID idResultado;

    public UnidadResultadoPK() {
    }

    public UUID getIdUnidad() {
        return this.idUnidad;
    }

    public void setIdUnidad(UUID idUnidad) {
        this.idUnidad = idUnidad;
    }

    public UUID getIdResultado() {
        return this.idResultado;
    }

    public void setIdResultado(UUID idResultado) {
        this.idResultado = idResultado;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnidadResultadoPK)) {
            return false;
        }
        UnidadResultadoPK castOther = (UnidadResultadoPK) other;
        return
                this.idUnidad.equals(castOther.idUnidad)
                        && this.idResultado.equals(castOther.idResultado);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.idUnidad.hashCode();
        hash = hash * prime + this.idResultado.hashCode();

        return hash;
    }
}