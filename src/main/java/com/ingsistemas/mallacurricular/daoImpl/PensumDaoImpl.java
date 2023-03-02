package com.ingsistemas.mallacurricular.daoImpl;

import com.ingsistemas.mallacurricular.dao.PensumDao;
import com.ingsistemas.mallacurricular.entity.Pensum;
import com.ingsistemas.mallacurricular.filters.PensumFilter;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public class PensumDaoImpl extends GenericDaoImpl<Pensum, UUID> implements PensumDao {

    @Override
    public List<Pensum> filterByFecha(PensumFilter filter) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Pensum> q = cb.createQuery(Pensum.class);
        Root<Pensum> pa = q.from(Pensum.class);
        Predicate[] predicates = construirPredicados(filter);
        q.select(pa).where(predicates);
        return entityManager.createQuery(q).getResultList();

    }

    private Predicate[] construirPredicados(PensumFilter filter) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Pensum> q = cb.createQuery(Pensum.class);
        Root<Pensum> pa = q.from(Pensum.class);
        ArrayList<Predicate> predicates = new ArrayList<Predicate>();

        if (filter.getFechaInicialA() != null) {
            predicates.add(cb.greaterThanOrEqualTo(pa.get("fechaInicio"), filter.getFechaInicialA()));
            if (filter.getFechaFinalB() != null) {
                predicates.add(cb.lessThanOrEqualTo(pa.get("fechaInicio"), filter.getFechaInicialB()));
            } else {
                Date date = new Date();
                predicates.add(cb.lessThanOrEqualTo(pa.get("fechaInicio"), date));
            }
        }
        if (filter.getFechaFinalA() != null) {
            predicates.add(cb.greaterThanOrEqualTo(pa.get("fechaFinal"), filter.getFechaFinalA()));
            if (filter.getFechaFinalB() != null) {
                predicates.add(cb.lessThanOrEqualTo(pa.get("fechaFinal"), filter.getFechaFinalB()));
            } else {
                Date date = new Date();
                predicates.add(cb.lessThanOrEqualTo(pa.get("fechaFinal"), date));
            }
        }
        if (filter.isActivo() != null) {
            predicates.add(cb.equal(pa.get("status"), filter.isActivo()));
        }

        return (Predicate[]) predicates.toArray();
    }


}
