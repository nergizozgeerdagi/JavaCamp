package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.SchoolAndDepartment;

public interface SchoolAndDepartmentService 
{
	Result add(SchoolAndDepartment schoolAndDepartment);
	DataResult<List<SchoolAndDepartment>> getAll();
}
