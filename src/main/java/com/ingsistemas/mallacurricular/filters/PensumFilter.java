package com.ingsistemas.mallacurricular.filters;

import java.util.Date;

public class PensumFilter extends MasterFilter {
    Date fechaInicialA;
    Date fechaInicialB;
    Date fechaFinalA;
    Date fechaFinalB;

    public Date getFechaInicialA() {
        return fechaInicialA;
    }

    public void setFechaInicialA(Date fechaInicialA) {
        this.fechaInicialA = fechaInicialA;
    }

    public Date getFechaInicialB() {
        return fechaInicialB;
    }

    public void setFechaInicialB(Date fechaInicialB) {
        this.fechaInicialB = fechaInicialB;
    }

    public Date getFechaFinalA() {
        return fechaFinalA;
    }

    public void setFechaFinalA(Date fechaFinalA) {
        this.fechaFinalA = fechaFinalA;
    }

    public Date getFechaFinalB() {
        return fechaFinalB;
    }

    public void setFechaFinalB(Date fechaFinalB) {
        this.fechaFinalB = fechaFinalB;
    }


}
