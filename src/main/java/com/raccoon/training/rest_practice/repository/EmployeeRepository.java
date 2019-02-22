package com.raccoon.training.rest_practice.repository;

import com.raccoon.training.rest_practice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
