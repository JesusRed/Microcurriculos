package com.ingsistemas.mallacurricular.filters;

import java.util.Date;

/**
 * The type Pensum filter.
 */
public class PensumFilter extends MasterFilter {
    /**
     * The Fecha inicial a.
     */
    Date fechaInicialA;
    /**
     * The Fecha inicial b.
     */
    Date fechaInicialB;
    /**
     * The Fecha final a.
     */
    Date fechaFinalA;
    /**
     * The Fecha final b.
     */
    Date fechaFinalB;

    /**
     * Gets fecha inicial a.
     *
     * @return the fecha inicial a
     */
    public Date getFechaInicialA() {
        return fechaInicialA;
    }

    /**
     * Sets fecha inicial a.
     *
     * @param fechaInicialA the fecha inicial a
     */
    public void setFechaInicialA(Date fechaInicialA) {
        this.fechaInicialA = fechaInicialA;
    }

    /**
     * Gets fecha inicial b.
     *
     * @return the fecha inicial b
     */
    public Date getFechaInicialB() {
        return fechaInicialB;
    }

    /**
     * Sets fecha inicial b.
     *
     * @param fechaInicialB the fecha inicial b
     */
    public void setFechaInicialB(Date fechaInicialB) {
        this.fechaInicialB = fechaInicialB;
    }

    /**
     * Gets fecha final a.
     *
     * @return the fecha final a
     */
    public Date getFechaFinalA() {
        return fechaFinalA;
    }

    /**
     * Sets fecha final a.
     *
     * @param fechaFinalA the fecha final a
     */
    public void setFechaFinalA(Date fechaFinalA) {
        this.fechaFinalA = fechaFinalA;
    }

    /**
     * Gets fecha final b.
     *
     * @return the fecha final b
     */
    public Date getFechaFinalB() {
        return fechaFinalB;
    }

    /**
     * Sets fecha final b.
     *
     * @param fechaFinalB the fecha final b
     */
    public void setFechaFinalB(Date fechaFinalB) {
        this.fechaFinalB = fechaFinalB;
    }


}
