package com.dbs.employeemngt.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dbs.employeemngt.dto.Employee;
import com.dbs.employeemngt.mapper.EmployeeRowMapper;
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
	@Override
	public Employee createEmployee(Employee employee) {
		String insertStatement = "insert into employee (empId, empFirstName,empLastName,empSalary,Address)"
				+"values(?,?,?,?,?)";
		// TODO Auto-generated method stub
		int result = jdbcTemplate.update(insertStatement,new Object[] {employee.getEmpId(),
				employee.getEmpFirstName(),employee.getEmpLastName(),employee.getEmpSalary(),employee.getAddress()});
		if(result>0)
			return employee;
		else
		return null;
	}
	@Autowired
    JdbcTemplate jdbcTemplate2;
	
	@Override
	public Employee deleteEmployee(String empId) {
		String deleteStatement = "delete from employee where employee.empId=?";
		int result = jdbcTemplate.update(deleteStatement,empId);
		return null;

	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		String query = "select * from employee where empId=?";
		Employee employee = jdbcTemplate.queryForObject(query, new EmployeeRowMapper(),empId);
		System.out.println(employee+"details");
		if(employee!=null) {
			return Optional.of(employee);
			}
		else
		{
			return Optional.empty();
		}
		
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		String query = "select * from employee";
		List<Employee> list = jdbcTemplate.query(query, new EmployeeRowMapper());
		System.out.println(list+"details");
		if(!list.isEmpty()) {
			return Optional.of(list);
		}
		else
		{
		return Optional.empty();
	}

	}
}
