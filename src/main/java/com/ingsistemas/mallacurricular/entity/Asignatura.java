package com.ingsistemas.mallacurricular.entity;

import com.ingsistemas.mallacurricular.converter.UUIDConverter;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the asignatura database table.
 */
@Table(name = "asignatura")
@Entity
@NamedQuery(name = "Asignatura.findAll", query = "SELECT a FROM Asignatura a")
public class Asignatura implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "acc_formacion_inv")
    private String accFormacionInv;

    @Column(name = "bibliografia")
    private String bibliografia;

    @Column(name = "creditos")
    private Integer creditos;
    @Column(name = "had")
    private String had;
    @Column(name = "hadhti")
    private String hadhti;
    @Column(name = "hti")
    private String hti;

    @Column(name = "descargable")
    private Boolean descargable;


    @JoinColumn(name = "id_area_formacion", nullable = false)
    @Convert(converter = UUIDConverter.class)
    @ManyToOne(fetch = FetchType.EAGER)
    private AreaFormacion areaFormacion;

    @JoinColumn(name = "id_pre_requisito", nullable = false)
    @Convert(converter = UUIDConverter.class)
    @ManyToOne(fetch = FetchType.EAGER)
    private PreRequisito preRequisito;


    public Boolean getDescargable() {
        return descargable;
    }

    public void setDescargable(Boolean descargable) {
        this.descargable = descargable;
    }

    public PreRequisito getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(PreRequisito preRequisito) {
        this.preRequisito = preRequisito;
    }

    @Column(name = "justificacion")
    private String justificacion;
    @Column(name = "metodologia")
    private String metodologia;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "objetivo")
    private String objetivo;
    @Column(name = "semestre")
    private String semestre;

    @Column(name = "tipo_credito")
    private String tipoCredito;

    @Column(name = "tipo_curso")
    private String tipoCurso;


    public Asignatura() {
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getAccFormacionInv() {
        return this.accFormacionInv;
    }

    public void setAccFormacionInv(String accFormacionInv) {
        this.accFormacionInv = accFormacionInv;
    }

    public String getBibliografia() {
        return this.bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public Integer getCreditos() {
        return this.creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public String getHad() {
        return this.had;
    }

    public void setHad(String had) {
        this.had = had;
    }

    public String getHadhti() {
        return this.hadhti;
    }

    public void setHadhti(String hadhti) {
        this.hadhti = hadhti;
    }

    public String getHti() {
        return this.hti;
    }


    public void setHti(String hti) {
        this.hti = hti;
    }


    public PreRequisito getIdPreRequisito() {
        return this.preRequisito;
    }

    public void setIdPreRequisito(PreRequisito preRequisito) {
        this.preRequisito = preRequisito;
    }

    public String getJustificacion() {
        return this.justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getMetodologia() {
        return this.metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getSemestre() {
        return this.semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getTipoCredito() {
        return this.tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public String getTipoCurso() {
        return this.tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public AreaFormacion getAreaFormacion() {
        return areaFormacion;
    }

    public void setAreaFormacion(AreaFormacion areaFormacion) {
        this.areaFormacion = areaFormacion;
    }


}