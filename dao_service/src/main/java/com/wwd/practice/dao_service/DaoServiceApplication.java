package com.wwd.practice.dao_service;

import com.wwd.practice.dao_service.dao.City;
import com.wwd.practice.dao_service.repository.CityRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
public class DaoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoServiceApplication.class, args);
    }

}
