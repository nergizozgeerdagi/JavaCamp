package com.example.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsProject.business.abstracts.CityService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Cities;

@RestController
@RequestMapping("/api/cities/")
@CrossOrigin
public class CitiesController 
{
	
	private CityService cityService;

	@Autowired
	public CitiesController(CityService cityService) 
	{
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Cities>> getAll()
	{
		
		return this.cityService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Cities city) 
	{
		return this.cityService.add(city);
	}
	
	
	

}