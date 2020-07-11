package com.wwd.practice.dao_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wwd.practice.dao_service.dao.City;

public interface CityRp extends JpaRepository<City,Long> {

    @Query(nativeQuery = true,value =
            "select id, name from city where name like :NAME limit 1")
    City findByNameLike(@Param("NAME") String NAME);
}
