package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.JobExperienceService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobExperiences/")
@CrossOrigin
public class JobExperienceController 
{

	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) 
	{
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@GetMapping("getall")
	public DataResult<List<JobExperience>> getAll()
	{
		return this.jobExperienceService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobExperience jobExperience) 
	{
		return this.jobExperienceService.add(jobExperience);
	}
	
	@GetMapping("getallbyorderbyendingdatedesc")
	public DataResult<List<JobExperience>> getAllByOrderByEndingDateDesc()
	{
		return this.jobExperienceService.getAllByOrderByEndingDateDesc();
	}
	
	@GetMapping("getallbycandidateidorderbyendingdatedesc")
	public DataResult<List<JobExperience>> getAllByCandidateIdOrderByEndingDateDesc(@RequestParam int candidateId)
	{
		return this.jobExperienceService.getAllByCandidateIdOrderByEndingDateDesc(candidateId);
	}
}