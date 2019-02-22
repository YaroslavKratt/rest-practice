package com.raccoon.training.rest_practice.model;

import lombok.Data;
import org.hibernate.annotations.Parent;

import javax.persistence.*;

@Data
@Entity
@Table
public class Report {

    @Column
    @Id
    @GeneratedValue
    private  Long id;
    private  String topic;

    @Parent
    private Conference conference;
}
