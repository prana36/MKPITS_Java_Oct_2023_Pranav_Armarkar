package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
