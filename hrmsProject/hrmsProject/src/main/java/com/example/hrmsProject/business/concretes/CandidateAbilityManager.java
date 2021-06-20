package com.example.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.CandidateAbilityService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.CandidateAbilityDao;
import com.example.hrmsProject.entities.concretes.CandidateAbility;

@Service
public class CandidateAbilityManager implements CandidateAbilityService
{

	private CandidateAbilityDao candidateAbilityDao;
	
	@Autowired
	public CandidateAbilityManager(CandidateAbilityDao candidateAbilityDao) 
	{
		super();
		this.candidateAbilityDao = candidateAbilityDao;
	}

	@Override
	public Result add(CandidateAbility candidateAbility) 
	{
	this.candidateAbilityDao.save(candidateAbility);
	return new SuccessResult(Messages.abilityAdded);
	}

	@Override
	public DataResult<List<CandidateAbility>> getAll() 
	{
		return new SuccessDataResult<List<CandidateAbility>>(this.candidateAbilityDao.findAll() , Messages.abilitiesListed);
	}

}