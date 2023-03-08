package com.ingsistemas.mallacurricular.dto;

import java.util.List;

/**
 * The type Persona dto.
 */
public class PersonaDto {
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

    private Integer codigo;
    private String correoElectronico;
    private String nombres;
    private boolean administrador;
    private boolean status;
    private List<ProgramaAcademicoDto> programaAcademicos;

    /**
     * Gets codigo.
     *
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
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
        return correoElectronico;
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
        return nombres;
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
    public List<ProgramaAcademicoDto> getProgramaAcademicos() {
        return programaAcademicos;
    }

    /**
     * Sets programa academicos.
     *
     * @param programaAcademicos the programa academicos
     */
    public void setProgramaAcademicos(List<ProgramaAcademicoDto> programaAcademicos) {
        this.programaAcademicos = programaAcademicos;
    }

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
