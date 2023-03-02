package com.ingsistemas.mallacurricular.dto;

import java.util.List;

public class PersonaDto {
    private interface Attributes {
        final String CODIGO = "codigo";
        final String CORREO_ELECTRONICO = "correoElectronico";
        final String NOMBRES = "nombres";
    }

    private Integer codigo;
    private String correoElectronico;
    private String nombres;
    private boolean administrador;
    private boolean status;
    private List<ProgramaAcademicoDto> programaAcademicos;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<ProgramaAcademicoDto> getProgramaAcademicos() {
        return programaAcademicos;
    }

    public void setProgramaAcademicos(List<ProgramaAcademicoDto> programaAcademicos) {
        this.programaAcademicos = programaAcademicos;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
