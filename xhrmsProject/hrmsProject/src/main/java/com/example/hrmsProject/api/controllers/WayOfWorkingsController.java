package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.WayOfWorkingService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.WayOfWorking;

@RestController
@RequestMapping("/api/wayOfWorkings/")
@CrossOrigin
public class WayOfWorkingsController 
{

	private WayOfWorkingService wayOfWorkingService;

	@Autowired
	public WayOfWorkingsController(WayOfWorkingService wayOfWorkingService) 
	{
		super();
		this.wayOfWorkingService = wayOfWorkingService;
	}
	
	@GetMapping("getall")
	public DataResult<List<WayOfWorking>> getAll()
	{
		return this.wayOfWorkingService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody WayOfWorking wayOfWorking)
	{
		return this.wayOfWorkingService.add(wayOfWorking);
	}
}