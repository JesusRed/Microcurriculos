package com.ingsistemas.mallacurricular.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the unidad_resultado database table.
 */
@Entity
@Table(name = "unidad_resultado")
@NamedQuery(name = "UnidadResultado.findAll", query = "SELECT u FROM UnidadResultado u")
public class UnidadResultado implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UnidadResultadoPK id;

    @Column(name = "corte_evaluacion")
    private String corteEvaluacion;

    @Column(name = "criterio_desempeño")
    private String criterioDesempeño;

    @Column(name = "instrumento_evaluacion")
    private String instrumentoEvaluacion;

    @Column(name = "tipo_evidencia")
    private String tipoEvidencia;

    public UnidadResultado() {
    }

    public UnidadResultadoPK getId() {
        return this.id;
    }

    public void setId(UnidadResultadoPK id) {
        this.id = id;
    }

    public String getCorteEvaluacion() {
        return this.corteEvaluacion;
    }

    public void setCorteEvaluacion(String corteEvaluacion) {
        this.corteEvaluacion = corteEvaluacion;
    }

    public String getCriterioDesempeño() {
        return this.criterioDesempeño;
    }

    public void setCriterioDesempeño(String criterioDesempeño) {
        this.criterioDesempeño = criterioDesempeño;
    }

    public String getInstrumentoEvaluacion() {
        return this.instrumentoEvaluacion;
    }

    public void setInstrumentoEvaluacion(String instrumentoEvaluacion) {
        this.instrumentoEvaluacion = instrumentoEvaluacion;
    }

    public String getTipoEvidencia() {
        return this.tipoEvidencia;
    }

    public void setTipoEvidencia(String tipoEvidencia) {
        this.tipoEvidencia = tipoEvidencia;
    }

}