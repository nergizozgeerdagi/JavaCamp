package com.example.hrmsProject.api.controllers;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.JobAdvertisementService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/JobAdvertisements")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired 
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) 
	{
		this.jobAdvertisementService=jobAdvertisementService;
	}
	
	@GetMapping("/getActivatedJobPosts")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() 
	{
		// TODO Auto-generated method stub
		return this.jobAdvertisementService.getByIsActiveTrue();
	}

	@GetMapping("/getJobPostsEmployer")
	DataResult<List<JobAdvertisement>>getByEmployer_Id(int id)
	{
		return this.jobAdvertisementService.getByEmployer_Id(id);
	}
	
	@GetMapping("/getBylastOfAppealDateBetweenAndIsActive")
	public DataResult<List<JobAdvertisement>> getBylastOfAppealDateBetweenAndIsActive(LocalDate startDate,
			LocalDate finalDate, boolean activated) 
	{
		return this.jobAdvertisementService.getBylastOfAppealDateBetweenAndIsActive(startDate, finalDate, activated);
	}
	
	@PostMapping("/addJobAdvertisement")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) 
	{
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	@PostMapping("/deactivateJobAdvertisement")
	public Result deactivateJobAdvertisement(@RequestParam Integer id) 
	{
		return this.jobAdvertisementService.deactivateJobAdvertisement(id);
	}
	
}