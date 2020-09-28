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


@Controller
public class employeecontroller {

		@GetMapping(path = "/employees")
		public String getEmployee(Model model){
			model.addAttribute("employees", Arrays.asList("Amit","Chetan","Nikhil","Srikanth"));
			return "employee";
		}

		@GetMapping(path = "/logout")
		public String logout(HttpServletRequest request) throws ServletException {
			request.logout();
			return "/";
		}


}

