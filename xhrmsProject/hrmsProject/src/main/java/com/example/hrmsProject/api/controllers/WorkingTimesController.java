package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.WorkingTimeService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.WorkingTime;

@RestController
@RequestMapping("/api/workingTimes/")
@CrossOrigin
public class WorkingTimesController 
{

	private WorkingTimeService workingTimeService;

	@Autowired
	public WorkingTimesController(WorkingTimeService workingTimeService) 
	{
		super();
		this.workingTimeService = workingTimeService;
	}
	
	@GetMapping("getall")
	public DataResult<List<WorkingTime>> getAll()
	{
		return this.workingTimeService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody WorkingTime workingTime) 
	{
		return this.workingTimeService.add(workingTime);
	}
	
}
