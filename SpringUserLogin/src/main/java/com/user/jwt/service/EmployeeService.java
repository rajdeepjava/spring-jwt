package com.user.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.jwt.entity.Employee;
import com.user.jwt.repos.EmployeeCrudRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeCrudRepo crudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee=crudRepo.save(employee);
		return savedEmployee;
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return crudRepo.findAll();
	}

	@Override
	public Employee getEmpById(Long empidL) {
		// TODO Auto-generated method stub
		return null;
	}

	


	
}
