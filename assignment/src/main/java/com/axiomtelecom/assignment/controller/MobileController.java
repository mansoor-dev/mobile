package com.axiomtelecom.assignment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.axiomtelecom.assignment.exception.MobileNotFoundException;
import com.axiomtelecom.assignment.response.MobileResponse;
import com.axiomtelecom.assignment.service.MobileServiceInterf;

@RestController

public class MobileController {

	@Autowired
	private MobileServiceInterf mobileService;

	@GetMapping(path = "/mobile/search")
	public @ResponseBody List<MobileResponse> getMobileData(@RequestParam Map<String, String> requestMap)
			throws Exception {
		List<MobileResponse> mobileResponse = new ArrayList<MobileResponse>();
		mobileResponse = mobileService.getMobileDetails(requestMap);
		if (mobileResponse == null || mobileResponse.isEmpty()) {
		    throw new MobileNotFoundException(requestMap);
		}
		
		return mobileResponse;
	}
		 @ExceptionHandler(MobileNotFoundException.class)
	        public void handleException(MobileNotFoundException  e) {
	         System.out.println("Exception triggered");
	        }
	
	

}
