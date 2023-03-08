package com.ingsistemas.mallacurricular.daoImpl;

import com.ingsistemas.mallacurricular.dao.AreaFormacionDao;
import com.ingsistemas.mallacurricular.entity.AreaFormacion;
import com.ingsistemas.mallacurricular.filters.AreaFormacionFilter;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

/**
 * The type Area formacion dao.
 */
@Repository
public class AreaFormacionDaoImpl extends GenericDaoImpl<AreaFormacion, UUID> implements AreaFormacionDao {

    @Override
    public List<AreaFormacion> filter(AreaFormacionFilter filter) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<AreaFormacion> q = cb.createQuery(AreaFormacion.class);
        Root<AreaFormacion> pa = q.from(AreaFormacion.class);
        Predicate[] predicates = new Predicate[1];
        predicates[0] = cb.equal(pa.get("nombre"), filter.getNombre());
        q.select(pa).where(predicates);
        return entityManager.createQuery(q).getResultList();
    }


}
