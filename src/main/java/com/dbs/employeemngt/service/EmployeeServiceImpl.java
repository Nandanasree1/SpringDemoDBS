package com.dbs.employeemngt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.employeemngt.dto.Employee;
import com.dbs.employeemngt.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    EmployeeRepository employeeRepository;
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.createEmployee(employee);
	}

	@Override
	public Employee deleteEmployee(String empId) {
	// TODO Auto-generated method stub
		return employeeRepository.deleteEmployee(empId);
	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeeById(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(empId);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}

}
