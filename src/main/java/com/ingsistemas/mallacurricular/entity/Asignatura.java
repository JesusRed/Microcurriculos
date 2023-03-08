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


    /**
     * Gets descargable.
     *
     * @return the descargable
     */
    public Boolean getDescargable() {
        return descargable;
    }

    /**
     * Sets descargable.
     *
     * @param descargable the descargable
     */
    public void setDescargable(Boolean descargable) {
        this.descargable = descargable;
    }

    /**
     * Gets pre requisito.
     *
     * @return the pre requisito
     */
    public PreRequisito getPreRequisito() {
        return preRequisito;
    }

    /**
     * Sets pre requisito.
     *
     * @param preRequisito the pre requisito
     */
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


    /**
     * Instantiates a new Asignatura.
     */
    public Asignatura() {
    }

    /**
     * Gets codigo.
     *
     * @return the codigo
     */
    public Integer getCodigo() {
        return this.codigo;
    }

    /**
     * Sets codigo.
     *
     * @param codigo the codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets acc formacion inv.
     *
     * @return the acc formacion inv
     */
    public String getAccFormacionInv() {
        return this.accFormacionInv;
    }

    /**
     * Sets acc formacion inv.
     *
     * @param accFormacionInv the acc formacion inv
     */
    public void setAccFormacionInv(String accFormacionInv) {
        this.accFormacionInv = accFormacionInv;
    }

    /**
     * Gets bibliografia.
     *
     * @return the bibliografia
     */
    public String getBibliografia() {
        return this.bibliografia;
    }

    /**
     * Sets bibliografia.
     *
     * @param bibliografia the bibliografia
     */
    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    /**
     * Gets creditos.
     *
     * @return the creditos
     */
    public Integer getCreditos() {
        return this.creditos;
    }

    /**
     * Sets creditos.
     *
     * @param creditos the creditos
     */
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    /**
     * Gets had.
     *
     * @return the had
     */
    public String getHad() {
        return this.had;
    }

    /**
     * Sets had.
     *
     * @param had the had
     */
    public void setHad(String had) {
        this.had = had;
    }

    /**
     * Gets hadhti.
     *
     * @return the hadhti
     */
    public String getHadhti() {
        return this.hadhti;
    }

    /**
     * Sets hadhti.
     *
     * @param hadhti the hadhti
     */
    public void setHadhti(String hadhti) {
        this.hadhti = hadhti;
    }

    /**
     * Gets hti.
     *
     * @return the hti
     */
    public String getHti() {
        return this.hti;
    }


    /**
     * Sets hti.
     *
     * @param hti the hti
     */
    public void setHti(String hti) {
        this.hti = hti;
    }


    /**
     * Gets id pre requisito.
     *
     * @return the id pre requisito
     */
    public PreRequisito getIdPreRequisito() {
        return this.preRequisito;
    }

    /**
     * Sets id pre requisito.
     *
     * @param preRequisito the pre requisito
     */
    public void setIdPreRequisito(PreRequisito preRequisito) {
        this.preRequisito = preRequisito;
    }

    /**
     * Gets justificacion.
     *
     * @return the justificacion
     */
    public String getJustificacion() {
        return this.justificacion;
    }

    /**
     * Sets justificacion.
     *
     * @param justificacion the justificacion
     */
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    /**
     * Gets metodologia.
     *
     * @return the metodologia
     */
    public String getMetodologia() {
        return this.metodologia;
    }

    /**
     * Sets metodologia.
     *
     * @param metodologia the metodologia
     */
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets objetivo.
     *
     * @return the objetivo
     */
    public String getObjetivo() {
        return this.objetivo;
    }

    /**
     * Sets objetivo.
     *
     * @param objetivo the objetivo
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * Gets semestre.
     *
     * @return the semestre
     */
    public String getSemestre() {
        return this.semestre;
    }

    /**
     * Sets semestre.
     *
     * @param semestre the semestre
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     * Gets tipo credito.
     *
     * @return the tipo credito
     */
    public String getTipoCredito() {
        return this.tipoCredito;
    }

    /**
     * Sets tipo credito.
     *
     * @param tipoCredito the tipo credito
     */
    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    /**
     * Gets tipo curso.
     *
     * @return the tipo curso
     */
    public String getTipoCurso() {
        return this.tipoCurso;
    }

    /**
     * Sets tipo curso.
     *
     * @param tipoCurso the tipo curso
     */
    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    /**
     * Gets area formacion.
     *
     * @return the area formacion
     */
    public AreaFormacion getAreaFormacion() {
        return areaFormacion;
    }

    /**
     * Sets area formacion.
     *
     * @param areaFormacion the area formacion
     */
    public void setAreaFormacion(AreaFormacion areaFormacion) {
        this.areaFormacion = areaFormacion;
    }


}