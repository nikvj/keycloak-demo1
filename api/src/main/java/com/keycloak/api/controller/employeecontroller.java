package com.keycloak.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keycloak.api.Employee;


@RestController
public class employeecontroller {

	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		
		List<Employee> employee=new ArrayList<>();
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("nikhil");
		
		employee.add(emp);
		

		return employee;
	}


}

