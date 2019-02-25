package com.raccoon.training.rest_practice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@Entity(name = "conference")
public class Conference {

    @Id
    @GeneratedValue
    private  Long id;
    private String topic;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Report> reports;

    public Conference(String topic) {
        this.topic = topic;
    }

    public Conference() {
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

}
