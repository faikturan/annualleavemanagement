package com.faikturan.annualleavemanagement.repository;


import com.faikturan.annualleavemanagement.entity.Employee;
import com.faikturan.annualleavemanagement.util.enums.EmployeeStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Override
    Page<Employee> findAll(Pageable pageable);

    Employee findByUsername(String username);

    Employee findByUsernameAndStatus(String username, EmployeeStatus status);

    // All employee under supervision of given employee
    List<Employee> findAllBySupervisor(Employee employee);

    Page<Employee> findByFirstNameContainingOrMiddleNameContainingOrLastNameContaining(Pageable pageable, String firstName, String middleName, String lastName);
}
