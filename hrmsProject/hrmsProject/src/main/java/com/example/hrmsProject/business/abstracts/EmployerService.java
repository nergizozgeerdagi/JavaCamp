package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Employer;

public interface EmployerService 
{
	boolean EmployerEmailControl();
	boolean EmployerUserControl(Employer employer);
	List<Employer> getEmployers();
	Result add(Employer employer);
	Result delete(Employer employer);
	DataResult<List<Employer>> getAll();
}