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
        final String CODIGO = "codigo";
        final String CORREO_ELECTRONICO = "correoElectronico";
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

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    //bi-directional many-to-one association to ProgramaAcademico
    @OneToMany(mappedBy = "director", fetch = FetchType.EAGER)
    private List<ProgramaAcademico> programaAcademicos;

    public Persona() {
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<ProgramaAcademico> getProgramaAcademicos() {
        return this.programaAcademicos;
    }

    public void setProgramaAcademicos(List<ProgramaAcademico> programaAcademicos) {
        this.programaAcademicos = programaAcademicos;
    }

    public ProgramaAcademico addProgramaAcademico(ProgramaAcademico programaAcademico) {
        getProgramaAcademicos().add(programaAcademico);
        programaAcademico.setPersona(this);

        return programaAcademico;
    }

    public ProgramaAcademico removeProgramaAcademico(ProgramaAcademico programaAcademico) {
        getProgramaAcademicos().remove(programaAcademico);
        programaAcademico.setPersona(null);

        return programaAcademico;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}