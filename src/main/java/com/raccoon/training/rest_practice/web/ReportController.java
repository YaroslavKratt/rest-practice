
    package com.raccoon.training.rest_practice.web;

import com.raccoon.training.rest_practice.exception.ReportNotFoundException;
import com.raccoon.training.rest_practice.model.Report;
import com.raccoon.training.rest_practice.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class ReportController {

        @Autowired
        private ReportRepository repository;

        @GetMapping("/reports")
        public Iterable<Report> getReports(){
            return  repository.findAll();
        }

        @PostMapping("/reports")
        Report newReport(@RequestBody Report newReport) {
            return repository.save(newReport);
        }

        @GetMapping("/reports/{id}")
        Report one(@PathVariable Long id) {

            return repository.findById(id)
                    .orElseThrow(() -> new ReportNotFoundException(id));
        }
    }


