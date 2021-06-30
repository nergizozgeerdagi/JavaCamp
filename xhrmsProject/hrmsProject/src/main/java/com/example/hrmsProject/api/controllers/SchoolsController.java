package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.SchoolService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.School;

@RestController
@RequestMapping("/api/schools/")
@CrossOrigin
public class SchoolsController 
{

	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) 
	{
		super();
		this.schoolService = schoolService;
	}
	
	@GetMapping("getall")
	public DataResult<List<School>> getAll()
	{
		return this.schoolService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody School school)
	{
		return this.schoolService.add(school);
	}
	
}
