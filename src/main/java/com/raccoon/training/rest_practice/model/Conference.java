package com.raccoon.training.rest_practice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "Conference")
@Table(name = "conference")
public class Conference {

    @Id
    @GeneratedValue
    private  Long id;
    private String topic;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy ="conference"
    )
    private List<Report> reports;

    public Conference(String topic, List<Report> reports) {
        this.topic = topic;
        this.reports = reports;
    }

    public Conference() {
    }
}
