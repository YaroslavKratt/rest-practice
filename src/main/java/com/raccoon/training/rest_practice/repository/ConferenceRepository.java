package com.raccoon.training.rest_practice.repository;

import com.raccoon.training.rest_practice.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}