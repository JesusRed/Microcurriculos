package com.ingsistemas.mallacurricular.repository;

import com.ingsistemas.mallacurricular.dao.AreaFormacionDao;
import com.ingsistemas.mallacurricular.entity.AreaFormacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AreaFormacionRepository extends JpaRepository<AreaFormacion, UUID>, AreaFormacionDao {

}
