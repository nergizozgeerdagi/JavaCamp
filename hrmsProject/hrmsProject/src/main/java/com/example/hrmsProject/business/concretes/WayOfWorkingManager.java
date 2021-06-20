package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.WayOfWorkingService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.WayOfWorkingDao;
import com.example.hrmsProject.entities.concretes.WayOfWorking;

@Service
public class WayOfWorkingManager implements WayOfWorkingService
{

	private WayOfWorkingDao wayOfWorkingDao;

	public WayOfWorkingManager(WayOfWorkingDao wayOfWorkingDao) 
	{
		super();
		this.wayOfWorkingDao = wayOfWorkingDao;
	}

	public DataResult<List<WayOfWorking>> getAll() 
	{
		return new SuccessDataResult<List<WayOfWorking>>(this.wayOfWorkingDao.findAll());
	}

	public Result add(WayOfWorking wayOfWorking) 
	{
		this.wayOfWorkingDao.save(wayOfWorking);
		return new SuccessResult();
	}
	
}