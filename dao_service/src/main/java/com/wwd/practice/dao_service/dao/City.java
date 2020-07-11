package com.wwd.practice.dao_service.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class City {
    @Id
    @Column
    private Long  id;

    @Column
    private String name;


    public City(){}

    public City(Long id, String name) {
        this.id = id;
        this.name = name;

    }

}
