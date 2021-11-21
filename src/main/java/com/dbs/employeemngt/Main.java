package com.dbs.employeemngt;

import java.util.Optional;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dbs.employeemngt.config.Config;
import com.dbs.employeemngt.dto.Employee;
import com.dbs.employeemngt.service.EmployeeService;

public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext applicationContext= new
        		AnnotationConfigApplicationContext(Config.class);
        
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        EmployeeService employeeService2 = applicationContext.getBean(EmployeeService.class);
        
        System.out.println(employeeService.hashCode());
        System.out.println(employeeService2.hashCode());
        System.out.println(employeeService.equals(employeeService2));
        System.out.println(employeeService==employeeService2);
        
        BasicDataSource basicDataSource=applicationContext.getBean("datasource",BasicDataSource.class);
       // basicDataSource basicDataSource2=applicationContext.getBean("datasource",BasicDataSource.class);
        
        System.out.println(basicDataSource==basicDataSource);
        //System.out.println(basicDataSource.equals(basicDataSource2));
        
        Employee employee = new Employee("er1234" , "nandana", "sree ","tirupathi",  100.0f);
        Employee employee2 = employeeService.createEmployee(employee);
        System.out.println(employee2);
   
        Optional<Employee> optional = employeeService.getEmployeeeById("er456");
        if(optional.isPresent()) {
        	System.out.println(optional.get());
        }
        else {
        	System.out.println("record not found");
        }
        employeeService.getEmployees().get().forEach(e->System.out.println(e));
	}

}