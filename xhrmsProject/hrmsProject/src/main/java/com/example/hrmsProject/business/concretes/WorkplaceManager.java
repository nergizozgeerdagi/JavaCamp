package com.example.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.WorkplaceService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.WorkplaceDao;
import com.example.hrmsProject.entities.concretes.Workplace;

@Service
public class WorkplaceManager implements WorkplaceService
{

	private WorkplaceDao workplaceDao;
	
	@Autowired
	public WorkplaceManager(WorkplaceDao workplaceDao) 
	{
		super();
		this.workplaceDao = workplaceDao;
	}

	@Override
	public Result add(Workplace workplace) 
	{
		this.workplaceDao.save(workplace);
		return new SuccessResult(Messages.workplaceAdded);
	}

	@Override
	public DataResult<List<Workplace>> getAll() {
		return new SuccessDataResult<List<Workplace>>(this.workplaceDao.findAll() , Messages.workplacesListed);
	}

}