package com.dbs.employeemngt.repository;

import java.util.List;

import java.util.Optional;

import com.dbs.employeemngt.dto.Employee;
public interface EmployeeRepository {
	
	public Employee createEmployee(Employee employee);
	public Employee deleteEmployee(String empId);
	public Employee updateEmployee(String empId, Employee employee);
	public Optional<Employee> getEmployeeById(String empId);
	public Optional<List<Employee>> getEmployees();
	
	
	
}

