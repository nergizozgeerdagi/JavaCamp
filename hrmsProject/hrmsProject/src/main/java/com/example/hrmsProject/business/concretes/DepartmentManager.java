package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.DepartmentService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.DepartmentDao;
import com.example.hrmsProject.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService
{

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) 
	{
		this.departmentDao = departmentDao;
	}
	
	@Override
	public Result add(Department department) 
	{
		this.departmentDao.save(department);
		return new SuccessResult(Messages.departmentAdded);
	}

	@Override
	public DataResult<List<Department>> getAll() 
	{
		return new SuccessDataResult<List<Department>>(this.departmentDao.findAll() , Messages.departmentsListed);
	}

}