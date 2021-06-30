package com.example.hrmsProject.business.abstracts;

import java.util.List;

import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.JobExperience;

public interface JobExperienceService 
{
	Result add(JobExperience jobExperience);
	DataResult<List<JobExperience>> getAll();
	DataResult<List<JobExperience>> getAllByOrderByEndingDateDesc();	
	DataResult<List<JobExperience>> getAllByCandidateIdOrderByEndingDateDesc(int candidateId);
}
