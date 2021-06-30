package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.LanguageCandidateService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.LanguageCandidate;

@RestController
@RequestMapping("/api/languageCandidatesController/")
@CrossOrigin
public class LanguageCandidatesController 
{
	
	private LanguageCandidateService languageCandidateService;

	@Autowired
	public LanguageCandidatesController(LanguageCandidateService languageCandidateService) 
	{
		super();
		this.languageCandidateService = languageCandidateService;
	}
	
	@GetMapping("getall")
	public DataResult<List<LanguageCandidate>> getAll()
	{
		return this.languageCandidateService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody LanguageCandidate languageCandidate)
	{
		return this.languageCandidateService.add(languageCandidate);
	}
	
}
