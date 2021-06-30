package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.EmployerService;
import com.example.hrmsProject.entities.concretes.Employer;

@RestController
@RequestMapping("/api/Employers")
public class EmployerController 
{
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) 
	{
		super();
		this.employerService=employerService;
	}
	
	@GetMapping("/getEmployerList")
	public List<Employer> getEmployerList()
	{
		return this.employerService.getEmployers();
	}
	

}