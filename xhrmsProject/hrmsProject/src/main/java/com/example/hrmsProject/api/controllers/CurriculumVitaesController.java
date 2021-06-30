package com.example.hrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsProject.business.abstracts.CurriculumVitaesService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.CurriculumVitaes;
import com.example.hrmsProject.entities.dtos.CurriculumVitaesDetailDto;

@RestController
@RequestMapping("/api/curriculumVitaesController/")
@CrossOrigin
public class CurriculumVitaesController 
{

	private CurriculumVitaesService curriculumVitaeService;

	@Autowired
	public CurriculumVitaesController(CurriculumVitaesService curriculumVitaeService) 
	{
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}
	
	@GetMapping("getcurriculumvitaesdetail")
	public DataResult<CurriculumVitaesDetailDto> getCurriculumVitae(@RequestParam int candidateId)
	{
		return this.curriculumVitaeService.getCurriculumVitaeByCandidateId(candidateId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody CurriculumVitaes curriculumVitae) 
	{
		return this.curriculumVitaeService.add(curriculumVitae);
	}
	
}