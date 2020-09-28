package com.keycloak.api.errorcontroller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class errorcontroller implements ErrorController {
	@RequestMapping("/error")
	public String handleError(HttpServletRequest request, Model model) {
		String errorPage ="error";
		
	    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	    
	    if (status != null) {
	        Integer statusCode = Integer.valueOf(status.toString());
	    
	        if(statusCode == HttpStatus.NOT_FOUND.value()) {
	        	
	        	errorPage = "error/404";
//	        	LOGGER.error("404 error");
	           
	        }
	        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
	        	
	        	errorPage = "error/500";
//	        	LOGGER.error("500 error");
	        }
	        else if(statusCode == HttpStatus.FORBIDDEN.value()) {
	        	
	        	errorPage = "error/403";
//	        	LOGGER.error("403 error");
	        }
	    }
	    return errorPage;
	}
	  @Override
	    public String getErrorPath() {
	        return "/error";
	    }
}

