package com.ingsistemas.mallacurricular.dto;

public class AsignaturaImprimibleDto {
    private Integer codigo;
    private String nombreAsignatura;
    private Integer preRequisito;
    private Integer creditos;
    private String bibliografia;
    private String ht;

    private String had;

    private String hadhti;
    private String th;


    private String contenidoBasico;


    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getNombreAsignatura() {
        return nombreAsignatura;
    }


    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }


    public Integer getPreRequisito() {
        return preRequisito;
    }


    public void setPreRequisito(Integer preRequisito) {
        this.preRequisito = preRequisito;
    }


    public Integer getCreditos() {
        return creditos;
    }


    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }


    public String getBibliografia() {
        return bibliografia;
    }


    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }


    public String getHt() {
        return ht;
    }


    public void setHt(String ht) {
        this.ht = ht;
    }


    public String getHad() {
        return had;
    }


    public void setHad(String had) {
        this.had = had;
    }


    public String getHadhti() {
        return hadhti;
    }


    public void setHadhti(String hadhti) {
        this.hadhti = hadhti;
    }


    public String getTh() {
        return th;
    }


    public void setTh(String th) {
        this.th = th;
    }


    public String getContenidoBasico() {
        return contenidoBasico;
    }


    public void setContenidoBasico(String contenidoBasico) {
        this.contenidoBasico = contenidoBasico;
    }

}
