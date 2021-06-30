package com.example.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.EmployerService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.dataAccess.abstracts.EmployerDao;
import com.example.hrmsProject.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService 
{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) 
	{
		this.employerDao=employerDao;
	}
	
	
	//employer mail daha önce eklendi mi kontrol edilir
	
	@Override
	public boolean EmployerEmailControl() 
	{
		if(true)
		{
			return false;
		}return true;}

	//employer boş birakilan alan kontrol

	@Override
	public boolean EmployerUserControl(Employer employer) 
	{
		if(employer.getName() !=null || employer.getPhone() !=null || employer.getWeb_site() !=null || 
				employer.getEmail() !=null || employer.getPassword() !=null) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}


	@Override
	public List<Employer> getEmployers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result delete(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}