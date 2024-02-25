package com.javaprograms.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprograms.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
 