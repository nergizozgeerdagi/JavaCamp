package com.example.hrmsProject.business.abstracts;

import java.util.List;

import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.WorkingTime;

public interface WorkingTimeService 
{
	DataResult<List<WorkingTime>> getAll();
	Result add(WorkingTime workingTime);
}
