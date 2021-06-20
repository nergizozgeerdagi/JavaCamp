package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.WorkplaceService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Workplace;

@RestController
@RequestMapping("/api/workplaces/")
@CrossOrigin
public class WorkplacesController 
{

	private WorkplaceService workplaceService;

	@Autowired
	public WorkplacesController(WorkplaceService workplaceService) 
	{
		super();
		this.workplaceService = workplaceService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Workplace>> getAll()
	{
		return this.workplaceService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Workplace workplace)
	{
		return this.workplaceService.add(workplace);
	}

}