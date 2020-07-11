package com.wwd.practice.module_api.controller;

import com.wwd.practice.dao_service.dao.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.wwd.practice.dao_service.dao.City;
import com.wwd.practice.dao_service.repository.CityRp;

@RestController
public class controller {


    @Autowired
    CityRp CityRp;


    @GetMapping("/hello")
    public String hello() {
        Integer id = 1;
        City ca = CityRp.findByNameLike("%Kab%");
        System.out.println(ca);

        return "hello world";
    }


}
