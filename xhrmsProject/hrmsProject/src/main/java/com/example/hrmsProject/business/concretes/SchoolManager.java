package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.SchoolService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.SchoolDao;
import com.example.hrmsProject.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService
{

	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) 
	{
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) 
	{
		this.schoolDao.save(school); 
		return new SuccessResult(Messages.schoolAdded);
	}

	@Override
	public DataResult<List<School>> getAll() 
	{
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll() , Messages.candidateSchoolsListed);
	}

}