package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.SchoolAndDepartmentService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.SchoolAndDepartmentDao;
import com.example.hrmsProject.entities.concretes.SchoolAndDepartment;

@Service
public class SchoolAndDepartmentManager implements SchoolAndDepartmentService
{

	private SchoolAndDepartmentDao schoolAndDepartmentDao;

	@Autowired
	public SchoolAndDepartmentManager(SchoolAndDepartmentDao schoolAndDepartmentDao) 
	{
		super();
		this.schoolAndDepartmentDao = schoolAndDepartmentDao;
	}

	public Result add(SchoolAndDepartment schoolAndDepartment) 
	{
		this.schoolAndDepartmentDao.save(schoolAndDepartment);
		return new SuccessResult(Messages.schoolAdded);
	}

	public DataResult<List<SchoolAndDepartment>> getAll() 
	{
		return new SuccessDataResult<List<SchoolAndDepartment>>(this.schoolAndDepartmentDao.findAll() , Messages.shoolsListed);
	}
	
	
}