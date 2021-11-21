package com.dbs.employeemngt.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
	private String empId;
	private String empFirstName;
	private String empLastName;
	private String address;
	private float empSalary;
}
