package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;

public interface CandidateSchoolWithDepartmentService 
{
	
	Result add(CandidateSchoolWithDepartment candidateSchoolWithDepartment);
	DataResult<List<CandidateSchoolWithDepartment>> getAll();
	DataResult<List<CandidateSchoolWithDepartment>> getAllByCandidateIdOrderByEndingDateDesc(int candidateId);
	DataResult<List<CandidateSchoolWithDepartment>> getAllByOrderByEndingDateDesc();
	
}
