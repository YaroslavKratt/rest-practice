package com.raccoon.training.rest_practice.web;

import com.raccoon.training.rest_practice.exception.EmployeeNotFoundException;
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
public class EmployeeController {
    
    @Autowired
    private ConferenceRepository repository;
    
    @GetMapping("/employees")
    public List<Conference> getEmployees(){
        return repository.findAll();
    }

    @PostMapping("/employees")
    Conference newEmployee(@RequestBody Conference newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Conference one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }
}
