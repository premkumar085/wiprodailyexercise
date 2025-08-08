package com.wipro.entity.relationdemo1.repo;

import com.wipro.entity.relationdemo1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
