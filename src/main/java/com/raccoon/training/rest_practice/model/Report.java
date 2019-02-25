package com.raccoon.training.rest_practice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.Parent;

import javax.persistence.*;

@Data
@Entity(name = "report")
public class Report {

    @Id
    @GeneratedValue
    private  Long id;
    private  String topic;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "conference_id")
      private Conference conference;
    public Report(String topic) {
        this.topic =topic;
    }
    public Report(){}

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public Conference getConference() {
        return conference;
    }
}

