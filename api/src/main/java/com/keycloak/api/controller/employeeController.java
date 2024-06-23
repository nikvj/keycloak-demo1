package com.keycloak.api.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class employeeController {

		@GetMapping(path = "/software-engineering")
		public String getEmployee(){
			return "softwareEngineering";
		}

		@GetMapping(path = "/logout")
		public String logout(HttpServletRequest request) throws ServletException {
			request.logout();
			return "/";
		}


}

