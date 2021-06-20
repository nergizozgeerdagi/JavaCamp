package com.example.hrmsProject.core.utilities.adapters.concretes;

import com.example.hrmsProject.core.utilities.adapters.abstracts.UserCheckService;

import com.example.hrmsProject.entities.concretes.Candidate;

public class UserCheckManager implements UserCheckService
{
	
	@Override
	public boolean checkUser(Candidate candidate) 
	{
		return candidate.getIdentityNumber().length() == 11;
	}

}