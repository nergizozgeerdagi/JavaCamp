package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.JobPositionService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions/")
@CrossOrigin
public class JobPositionController 
{

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionController(JobPositionService jobPositionService) 
	{
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("getall")
	public DataResult<List<JobPosition>> getAll()
	{
		return this.jobPositionService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobPosition jobPosition)
	{
		return this.jobPositionService.add(jobPosition);
	}
	
}