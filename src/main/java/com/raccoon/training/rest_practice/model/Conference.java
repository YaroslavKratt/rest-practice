package com.raccoon.training.rest_practice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Conference {
    
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public Conference(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Conference() {
    }
}
