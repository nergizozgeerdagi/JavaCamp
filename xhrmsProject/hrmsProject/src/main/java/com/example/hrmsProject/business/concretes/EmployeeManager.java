package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.EmployeeService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.EmployeeDao;
import com.example.hrmsProject.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrmsProject.entities.concretes.Employee;
import com.example.hrmsProject.entities.concretes.JobAdvertisement;

@Service
public class EmployeeManager implements EmployeeService
{

	private EmployeeDao employeeDao;
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao , JobAdvertisementDao jobAdvertisementDao) 
	{
		super();
		this.employeeDao = employeeDao;
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() 
	{
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),Messages.employeesListed);
	}

	@Override
	public Result add(Employee employee) 
	{
		employeeDao.save(employee);
		return new SuccessResult(Messages.employeeAdded);
	}

	@Override
	public DataResult<List<JobAdvertisement>> getJobAdvertisementsInactive() 
	{
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByActiveFalse());
	}

	@Override
	public Result confirmJobAdvertisement(int jobAdvertisementId)
	{
		JobAdvertisement refereceObject = this.jobAdvertisementDao.getOne(jobAdvertisementId);
		refereceObject.setActive(true);
		this.jobAdvertisementDao.save(refereceObject);
		return new SuccessResult();
		
	}
	
	@Override
	public Result delete(int jobAdvertisementId) 
	{
		JobAdvertisement objectForDelete = this.jobAdvertisementDao.getOne(jobAdvertisementId);
		this.jobAdvertisementDao.delete(objectForDelete);
		return new SuccessResult();
	}

}
