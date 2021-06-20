package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.LanguageStageService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.LanguageStage;

@RestController
@RequestMapping("/api/languageStagesController/")
@CrossOrigin
public class LanguageStagesController 
{

	private LanguageStageService languageStageService;

	@Autowired
	public LanguageStagesController(LanguageStageService languageStageService) 
	{
		super();
		this.languageStageService = languageStageService;
	}
	
	@GetMapping("getall")
	public DataResult<List<LanguageStage>> getAll()
	{
		
		return this.languageStageService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody LanguageStage languageStage)
	{
		
		return this.languageStageService.add(languageStage);
	}
	
}