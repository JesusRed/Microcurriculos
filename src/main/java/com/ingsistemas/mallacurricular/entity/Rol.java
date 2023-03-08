package com.ingsistemas.mallacurricular.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.io.Serializable;


/**
 * The persistent class for the rol database table.
 */
@Entity
@NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_rol")
    private Integer idRol;

    @Column(name = "rol_nombre")
    private String rolNombre;

    /**
     * Instantiates a new Rol.
     */
    public Rol() {
    }

    /**
     * Gets id rol.
     *
     * @return the id rol
     */
    public Integer getIdRol() {
        return this.idRol;
    }

    /**
     * Sets id rol.
     *
     * @param idRol the id rol
     */
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    /**
     * Gets rol nombre.
     *
     * @return the rol nombre
     */
    public String getRolNombre() {
        return this.rolNombre;
    }

    /**
     * Sets rol nombre.
     *
     * @param rolNombre the rol nombre
     */
    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

}