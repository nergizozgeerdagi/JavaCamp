package com.example.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsProject.business.abstracts.CandidateAbilityService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.CandidateAbility;

@RestController
@RequestMapping("/api/candidateAbilities")
@CrossOrigin
public class CandidateAbilitiesController 
{

	private CandidateAbilityService candidateAbilityService;

	@Autowired
	public CandidateAbilitiesController(CandidateAbilityService candidateAbilityService) 
	{
		super();
		this.candidateAbilityService = candidateAbilityService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<CandidateAbility>> getAll() 
	{
		return this.candidateAbilityService.getAll();
				
	}
	
	@PostMapping("add")
	public Result add(@RequestBody CandidateAbility candidateAbility) 
	{
		return this.candidateAbilityService.add(candidateAbility);
	}
}