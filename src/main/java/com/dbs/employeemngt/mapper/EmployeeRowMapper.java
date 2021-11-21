package com.dbs.employeemngt.mapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.dbs.employeemngt.dto.Employee;

public class EmployeeRowMapper implements  RowMapper<Employee> , Serializable{
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getString("empId"));
		employee.setEmpFirstName(rs.getString("empFirstName"));
		employee.setEmpLastName(rs.getNString("empLastName"));
		employee.setEmpSalary(rs.getFloat("empSalary"));
		employee.setAddress(rs.getString("Address"));
		return employee;
		
	}
	
}



