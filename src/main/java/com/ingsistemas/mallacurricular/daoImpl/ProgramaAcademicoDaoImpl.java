package com.ingsistemas.mallacurricular.daoImpl;

import com.ingsistemas.mallacurricular.dao.ProgramaAcademicoDao;
import com.ingsistemas.mallacurricular.entity.ProgramaAcademico;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

/**
 * The type Programa academico dao.
 */
@Repository
public class ProgramaAcademicoDaoImpl extends GenericDaoImpl<ProgramaAcademico, UUID> implements ProgramaAcademicoDao {

    @Override
    public List<ProgramaAcademico> getByDirector(Integer id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ProgramaAcademico> q = cb.createQuery(ProgramaAcademico.class);
        Root<ProgramaAcademico> pa = q.from(ProgramaAcademico.class);
        Predicate[] predicates = new Predicate[1];
        predicates[0] = cb.equal(pa.get("director"), id);
        q.select(pa).where(predicates);
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<ProgramaAcademico> getByNombre(String nombre) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ProgramaAcademico> q = cb.createQuery(ProgramaAcademico.class);
        Root<ProgramaAcademico> pa = q.from(ProgramaAcademico.class);
        Predicate[] predicates = new Predicate[1];
        predicates[0] = cb.like(pa.get("nombre"), nombre);
        q.select(pa).where(predicates);
        return entityManager.createQuery(q).getResultList();
    }


}
