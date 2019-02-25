package com.raccoon.training.rest_practice.repository;

import com.raccoon.training.rest_practice.model.Conference;
import com.raccoon.training.rest_practice.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends CrudRepository<Report, Long> {

}
