package com.raccoon.training.rest_practice.configuration;

import com.raccoon.training.rest_practice.model.Conference;
import com.raccoon.training.rest_practice.repository.ConferenceRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@Slf4j
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ConferenceRepository repository) {

        return args -> {

        };
    }
}