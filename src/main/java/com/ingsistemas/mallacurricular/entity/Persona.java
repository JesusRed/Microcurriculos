package com.ingsistemas.mallacurricular.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the persona database table.
 */
@Entity
@NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private interface Attributes {
        /**
         * The constant CODIGO.
         */
        final String CODIGO = "codigo";
        /**
         * The constant CORREO_ELECTRONICO.
         */
        final String CORREO_ELECTRONICO = "correoElectronico";
        /**
         * The constant NOMBRES.
         */
        final String NOMBRES = "nombres";
    }


    @Id
    private Integer codigo;


    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "status")
    private boolean status;

    @Column(name = "administrador")
    private boolean administrador;

    /**
     * Is administrador boolean.
     *
     * @return the boolean
     */
    public boolean isAdministrador() {
        return administrador;
    }

    /**
     * Sets administrador.
     *
     * @param administrador the administrador
     */
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    //bi-directional many-to-one association to ProgramaAcademico
    @OneToMany(mappedBy = "director", fetch = FetchType.EAGER)
    private List<ProgramaAcademico> programaAcademicos;

    /**
     * Instantiates a new Persona.
     */
    public Persona() {
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
     * Gets correo electronico.
     *
     * @return the correo electronico
     */
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    /**
     * Sets correo electronico.
     *
     * @param correoElectronico the correo electronico
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Gets nombres.
     *
     * @return the nombres
     */
    public String getNombres() {
        return this.nombres;
    }

    /**
     * Sets nombres.
     *
     * @param nombres the nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Gets programa academicos.
     *
     * @return the programa academicos
     */
    public List<ProgramaAcademico> getProgramaAcademicos() {
        return this.programaAcademicos;
    }

    /**
     * Sets programa academicos.
     *
     * @param programaAcademicos the programa academicos
     */
    public void setProgramaAcademicos(List<ProgramaAcademico> programaAcademicos) {
        this.programaAcademicos = programaAcademicos;
    }

    /**
     * Add programa academico programa academico.
     *
     * @param programaAcademico the programa academico
     * @return the programa academico
     */
    public ProgramaAcademico addProgramaAcademico(ProgramaAcademico programaAcademico) {
        getProgramaAcademicos().add(programaAcademico);
        programaAcademico.setPersona(this);

        return programaAcademico;
    }

    /**
     * Remove programa academico programa academico.
     *
     * @param programaAcademico the programa academico
     * @return the programa academico
     */
    public ProgramaAcademico removeProgramaAcademico(ProgramaAcademico programaAcademico) {
        getProgramaAcademicos().remove(programaAcademico);
        programaAcademico.setPersona(null);

        return programaAcademico;
    }

    /**
     * Is status boolean.
     *
     * @return the boolean
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

}