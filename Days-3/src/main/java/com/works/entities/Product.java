package com.works.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Long pid;

    @Column(unique = true)
    private String title;

    private String description;
    private Integer price;
    private Boolean status;

}
