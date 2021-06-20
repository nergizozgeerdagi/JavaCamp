package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.JobExperienceService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.JobExperienceDao;
import com.example.hrmsProject.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService
{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao)
	{
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) 
	{
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult(Messages.jobExperienceAdded);
	}

	@Override
	public DataResult<List<JobExperience>> getAll() 
	{
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll() , Messages.jobExperiencesListed);
	}

	@Override
	public DataResult<List<JobExperience>> getAllByOrderByEndingDateDesc() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getAllByOrderByEndingDateDesc() , Messages.jobExperiencesListed);
	}

	@Override
	public DataResult<List<JobExperience>> getAllByCandidateIdOrderByEndingDateDesc(int candidateId) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getAllByCandidateIdOrderByEndingDateDesc(candidateId) 
				, Messages.jobExperiencesListed);
	}

}