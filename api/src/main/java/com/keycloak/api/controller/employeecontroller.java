package com.keycloak.api.controller;

import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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

