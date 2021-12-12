package com.csa.samplefullstack.repository;

import com.csa.samplefullstack.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("/api/v1")
@CrossOrigin("*")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    }


