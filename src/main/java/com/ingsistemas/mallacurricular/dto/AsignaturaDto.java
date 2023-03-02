package com.ingsistemas.mallacurricular.dto;

public class AsignaturaDto {
    private Integer codigo;


    private String accFormacionInv;


    private String bibliografia;


    private Integer creditos;

    private String had;

    private String hadhti;

    private String hti;

    private Boolean descargable;

    private AreaFormacionDto areaFormacion;

    private PreRequisitoDto preRequisito;

    private String justificacion;

    private String metodologia;

    private String nombre;

    private String objetivo;

    private String semestre;


    private String tipoCredito;

    private String tipoCurso;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAccFormacionInv() {
        return accFormacionInv;
    }

    public void setAccFormacionInv(String accFormacionInv) {
        this.accFormacionInv = accFormacionInv;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
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

    public String getHti() {
        return hti;
    }

    public void setHti(String hti) {
        this.hti = hti;
    }

    public AreaFormacionDto getAreaFormacion() {
        return areaFormacion;
    }

    public void setAreaFormacion(AreaFormacionDto areaFormacion) {
        this.areaFormacion = areaFormacion;
    }

    public PreRequisitoDto getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(PreRequisitoDto preRequisito) {
        this.preRequisito = preRequisito;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Boolean getDescargable() {
        return descargable;
    }

    public void setDescargable(Boolean descargable) {
        this.descargable = descargable;
    }


}
