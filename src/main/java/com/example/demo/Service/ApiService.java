package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.EmployeeRepo;


	@Service
	public class ApiService {
	@Autowired
	EmployeeRepo repository;

	
}
