package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.CandidateService;
import com.example.hrmsProject.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/Candidates")
public class CandidateController 
{
	
	private CandidateService candidateService;

	@Autowired
	public CandidateController(CandidateService candidateService) 
	{
		super();
		this.candidateService=candidateService;
	}
	
	@GetMapping("/getCandidateList")
	public List<Candidate> getCandidateList(){
		return this.candidateService.getCandidates();
	}
	
	
}