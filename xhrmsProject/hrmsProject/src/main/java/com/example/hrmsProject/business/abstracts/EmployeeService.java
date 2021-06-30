package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Employee;
import com.example.hrmsProject.entities.concretes.JobAdvertisement;

public interface EmployeeService 
{
	DataResult<List<Employee>> getAll();
	DataResult<List<JobAdvertisement>> getJobAdvertisementsInactive();
	Result confirmJobAdvertisement(int jobAdvertisementId);
	Result add(Employee employee);
	Result delete(int jobAdvertisementId);
}
