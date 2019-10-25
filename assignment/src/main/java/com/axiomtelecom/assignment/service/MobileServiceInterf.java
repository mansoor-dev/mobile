package com.axiomtelecom.assignment.service;

import java.util.List;
import java.util.Map;

import com.axiomtelecom.assignment.response.MobileResponse;

public interface MobileServiceInterf {
	public List<MobileResponse> getMobileDetails(Map<String, String> requestMap) throws Exception;

}
