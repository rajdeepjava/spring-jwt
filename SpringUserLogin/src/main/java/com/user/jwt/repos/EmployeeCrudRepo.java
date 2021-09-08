package com.user.jwt.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.jwt.entity.*;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long>{

}
