package com.raccoon.training.rest_practice.configuration;

import com.raccoon.training.rest_practice.model.Conference;
import com.raccoon.training.rest_practice.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Conference("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Conference("Frodo Baggins", "thief")));
        };
    }
}