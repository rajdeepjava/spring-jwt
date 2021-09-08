package com.user.jwt.service;

import java.util.List;

import com.user.jwt.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmpById(Long empidL);

}
