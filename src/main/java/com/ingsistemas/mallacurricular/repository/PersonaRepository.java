package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.dao.PersonaDao;
import com.ingsistemas.mallacurricular.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Persona repository.
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>, PersonaDao {

    Persona findByCorreo(String correo);

}
