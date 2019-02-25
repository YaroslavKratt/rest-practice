package com.raccoon.training.rest_practice.web;

import com.raccoon.training.rest_practice.exception.ConferenceNotFoundException;
import com.raccoon.training.rest_practice.model.Conference;
import com.raccoon.training.rest_practice.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConferenceController {
    
    @Autowired
    private ConferenceRepository repository;
    
    @GetMapping("/conferences")
    public Iterable<Conference> getConferences(){
        return  repository.findAll();
    }

    @PostMapping("/conferences")
    Conference newConference(@RequestBody Conference newConference) {
        return repository.save(newConference);
    }

    @GetMapping("/conferences/{id}")
    Conference one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ConferenceNotFoundException(id));
    }
}
