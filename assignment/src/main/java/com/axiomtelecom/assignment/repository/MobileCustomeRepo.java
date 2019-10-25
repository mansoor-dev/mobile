package com.axiomtelecom.assignment.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface MobileCustomeRepo {

	List<Object[]> search(Map<String, String> requestMap);

}
