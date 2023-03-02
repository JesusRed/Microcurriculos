package com.ingsistemas.mallacurricular.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the competencia_resultado database table.
 */
@Entity
@Table(name = "competencia_resultado")
@NamedQuery(name = "CompetenciaResultado.findAll", query = "SELECT c FROM CompetenciaResultado c")
public class CompetenciaResultado implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CompetenciaResultadoPK id;

    public CompetenciaResultado() {
    }

    public CompetenciaResultadoPK getId() {
        return this.id;
    }

    public void setId(CompetenciaResultadoPK id) {
        this.id = id;
    }

}