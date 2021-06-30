package com.example.hrmsProject.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.AbilityService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.AbilityDao;
import com.example.hrmsProject.entities.concretes.Ability;

@Service
	public class AbilityManager implements AbilityService
	{

		private AbilityDao abilityDao;
		
		@Autowired
		public AbilityManager(AbilityDao abilityDao)
		{
			super();
			this.abilityDao = abilityDao;
		}

		public Result add(Ability ability) 
		{
			this.abilityDao.save(ability);
			return new SuccessResult(Messages.abilityAdded);
		}

		public DataResult<List<Ability>> getAll() 
		{
			return new SuccessDataResult<List<Ability>>(this.abilityDao.findAll() , Messages.abilitiesListed);
		}
		
	}

