package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.dao.PensumDao;
import com.ingsistemas.mallacurricular.entity.Pensum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PensumRepository extends JpaRepository<Pensum, Integer>, PensumDao {
    @Query(value = "SELECT nextval('pensum_seq');", nativeQuery =
            true)
    Long getNextSeriesId();
}
