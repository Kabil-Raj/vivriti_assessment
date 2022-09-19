package com.vivriti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivriti.model.Employee;

@Repository
public interface EmployeeRepository extends  JpaRepository<Employee, Integer> {

}
