package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.WayOfWorking;

public interface WayOfWorkingService 
{
	DataResult<List<WayOfWorking>> getAll();
	Result add(WayOfWorking wayOfWorking);
}
