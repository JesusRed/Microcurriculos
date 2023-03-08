package com.ingsistemas.mallacurricular.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the competencia_resultado database table.
 */
@Embeddable
public class CompetenciaResultadoPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name = "id_competencia")
    private String idCompetencia;

    @Column(name = "id_resultado")
    private String idResultado;

    /**
     * Instantiates a new Competencia resultado pk.
     */
    public CompetenciaResultadoPK() {
    }

    /**
     * Gets id competencia.
     *
     * @return the id competencia
     */
    public String getIdCompetencia() {
        return this.idCompetencia;
    }

    /**
     * Sets id competencia.
     *
     * @param idCompetencia the id competencia
     */
    public void setIdCompetencia(String idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    /**
     * Gets id resultado.
     *
     * @return the id resultado
     */
    public String getIdResultado() {
        return this.idResultado;
    }

    /**
     * Sets id resultado.
     *
     * @param idResultado the id resultado
     */
    public void setIdResultado(String idResultado) {
        this.idResultado = idResultado;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetenciaResultadoPK)) {
            return false;
        }
        CompetenciaResultadoPK castOther = (CompetenciaResultadoPK) other;
        return this.idCompetencia.equals(castOther.idCompetencia) && this.idResultado.equals(castOther.idResultado);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.idCompetencia.hashCode();
        hash = hash * prime + this.idResultado.hashCode();

        return hash;
    }
}