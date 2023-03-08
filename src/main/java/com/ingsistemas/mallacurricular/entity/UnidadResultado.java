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

    /**
     * Instantiates a new Unidad resultado.
     */
    public UnidadResultado() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public UnidadResultadoPK getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(UnidadResultadoPK id) {
        this.id = id;
    }

    /**
     * Gets corte evaluacion.
     *
     * @return the corte evaluacion
     */
    public String getCorteEvaluacion() {
        return this.corteEvaluacion;
    }

    /**
     * Sets corte evaluacion.
     *
     * @param corteEvaluacion the corte evaluacion
     */
    public void setCorteEvaluacion(String corteEvaluacion) {
        this.corteEvaluacion = corteEvaluacion;
    }

    /**
     * Get criterio desempeño string.
     *
     * @return the string
     */
    public String getCriterioDesempeño() {
        return this.criterioDesempeño;
    }

    /**
     * Set criterio desempeño.
     *
     * @param criterioDesempeño the criterio desempeño
     */
    public void setCriterioDesempeño(String criterioDesempeño) {
        this.criterioDesempeño = criterioDesempeño;
    }

    /**
     * Gets instrumento evaluacion.
     *
     * @return the instrumento evaluacion
     */
    public String getInstrumentoEvaluacion() {
        return this.instrumentoEvaluacion;
    }

    /**
     * Sets instrumento evaluacion.
     *
     * @param instrumentoEvaluacion the instrumento evaluacion
     */
    public void setInstrumentoEvaluacion(String instrumentoEvaluacion) {
        this.instrumentoEvaluacion = instrumentoEvaluacion;
    }

    /**
     * Gets tipo evidencia.
     *
     * @return the tipo evidencia
     */
    public String getTipoEvidencia() {
        return this.tipoEvidencia;
    }

    /**
     * Sets tipo evidencia.
     *
     * @param tipoEvidencia the tipo evidencia
     */
    public void setTipoEvidencia(String tipoEvidencia) {
        this.tipoEvidencia = tipoEvidencia;
    }

}