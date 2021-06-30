package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Ability;

public interface AbilityService 
{
	
	Result add(Ability ability);	
	DataResult<List<Ability>> getAll();
	
}
