package com.ingsistemas.mallacurricular.daoImpl;

import com.ingsistemas.mallacurricular.dao.PersonaDao;
import com.ingsistemas.mallacurricular.entity.Persona;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;


@Repository
public class PersonaDaoImpl implements PersonaDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Persona findByCorreo(String correo) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Persona> q = cb.createQuery(Persona.class);
        Root<Persona> pa = q.from(Persona.class);
        ArrayList<Predicate> predicates = new ArrayList<Predicate>();
        predicates.add(cb.equal(pa.get("correo"), correo));
        q.select(pa).where((Predicate[]) predicates.toArray());
        return entityManager.createQuery(q).getSingleResult();


    }


}
