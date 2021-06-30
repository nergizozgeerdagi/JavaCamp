package com.example.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsProject.business.abstracts.AbilityService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Ability;

@RestController
@RequestMapping("/api/abilities/")
@CrossOrigin
public class AbilitiesController 
{

	private AbilityService abilityService;

	@Autowired
	public AbilitiesController(AbilityService abilityService) 
	{
		super();
		this.abilityService = abilityService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Ability>> getAll()
	{
		return this.abilityService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Ability ability) 
	{
		return this.abilityService.add(ability);
	}
	
}