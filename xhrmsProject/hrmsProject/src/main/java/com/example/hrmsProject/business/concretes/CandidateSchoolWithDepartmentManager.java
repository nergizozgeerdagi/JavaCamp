package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.CandidateSchoolWithDepartmentService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.CandidateSchoolWithDepartmentDao;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;

@Service
public class CandidateSchoolWithDepartmentManager implements CandidateSchoolWithDepartmentService
{

	private CandidateSchoolWithDepartmentDao candidateSchoolWithDepartmentDao;
	
	@Autowired
	public CandidateSchoolWithDepartmentManager(CandidateSchoolWithDepartmentDao candidateSchoolWithDepartmentDao) 
	{
		super();
		this.candidateSchoolWithDepartmentDao = candidateSchoolWithDepartmentDao;
	}

	public Result add(CandidateSchoolWithDepartment candidateSchoolWithDepartment) 
	{
		this.candidateSchoolWithDepartmentDao.save(candidateSchoolWithDepartment);
		return new SuccessResult(Messages.candidateSchoolAdded);
	}

	public DataResult<List<CandidateSchoolWithDepartment>> getAll() 
	{
		return new SuccessDataResult<List<CandidateSchoolWithDepartment>>(this.candidateSchoolWithDepartmentDao.findAll() 
				, Messages.candidateSchoolsListed);
	}

	public DataResult<List<CandidateSchoolWithDepartment>> getAllByCandidateIdOrderByEndingDateDesc(int candidateId) 
	{
		return new SuccessDataResult<List<CandidateSchoolWithDepartment>>
		(this.candidateSchoolWithDepartmentDao.getAllByCandidateIdOrderByEndingDateDesc(candidateId) , Messages.candidateSchoolsListed);
	}

	public DataResult<List<CandidateSchoolWithDepartment>> getAllByOrderByEndingDateDesc()
	{
		return new SuccessDataResult<List<CandidateSchoolWithDepartment>>(this.candidateSchoolWithDepartmentDao.getAllByOrderByEndingDateDesc() , Messages.candidateSchoolsListed);
	}

}