package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.LanguageService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages/")
@CrossOrigin
public class LanguagesController 
{

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) 
	{
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("get")
	public DataResult<List<Language>> getAll() 
	{
		return this.languageService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Language language) 
	{
		return this.languageService.add(language);
	}
	
}