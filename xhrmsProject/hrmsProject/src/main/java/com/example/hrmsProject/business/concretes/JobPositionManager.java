package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.JobPositionService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.ErrorResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.JobPositionDao;
import com.example.hrmsProject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService
{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) 
	{
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() 
	{
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll() , Messages.jobPositionsListed);
	}

	@Override
	public Result add(JobPosition jobPosition) 
	{
		if (this.isDataRightChecker(jobPosition).isSuccess()) 
		{
			this.jobPositionDao.save(jobPosition);
		return new SuccessResult(Messages.jobPositionAdded);
		}
		
		return this.isDataRightChecker(jobPosition);
		
	}
	
	private Result isDataRightChecker(JobPosition jobPosition)
	{
		if (jobPosition.getPositionName().isBlank() || jobPosition.getPositionName().equals(null)) 
		{
			return new ErrorResult("Pozisyon adı boş bırakılamaz.");
		}
		
		return new SuccessResult();
	}

}