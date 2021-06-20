package com.example.hrmsProject.business.concretes;

import java.util.List;
import com.example.hrmsProject.business.abstracts.EmployerService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.dataAccess.abstracts.UserDao;
import com.example.hrmsProject.entities.concretes.Employer;
import com.example.hrmsProject.entities.concretes.User;

public class EmployerManager implements EmployerService 
{

	private User user;
	private UserDao userDao;
	
	public EmployerManager(User user, UserDao userDao) 
	{
		super();
		this.user=user;
		this.userDao=userDao;
	}
	
	
	//employer mail daha önce eklendi mi kontrol edilir
	
	@Override
	public boolean EmployerEmailControl() 
	{
		if(this.userDao.getAllEmail().contains(this.user.getEMail()))
		{
			return false;
		}
		else 
		{
			return true;
		}
	}

	//employer boş birakilan alan kontrol

	@Override
	public boolean EmployerUserControl(Employer employer) 
	{
		if(employer.getName() !=null || employer.getPhone() !=null || employer.getWeb_site() !=null || 
				this.user.getEMail() !=null || this.user.getPassword() !=null) 
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