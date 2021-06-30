package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.WorkingTimeService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.WorkingTimeDao;
import com.example.hrmsProject.entities.concretes.WorkingTime;

@Service
public class WorkingTimeManager implements WorkingTimeService
{

	private WorkingTimeDao workingTimeDao;

	@Autowired
	public WorkingTimeManager(WorkingTimeDao workingTimeDao) 
	{
		super();
		this.workingTimeDao = workingTimeDao;
	}

	public DataResult<List<WorkingTime>> getAll() 
	{
		return new SuccessDataResult<List<WorkingTime>>(this.workingTimeDao.findAll());
	}

	public Result add(WorkingTime workingTime) 
	{
		this.workingTimeDao.save(workingTime);
		return new SuccessResult();
	}
}