package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.LanguageStageService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.LanguageStageDao;
import com.example.hrmsProject.entities.concretes.LanguageStage;

@Service
public class LanguageStageManager implements LanguageStageService 
{

	private LanguageStageDao languageStageDao;

	@Autowired
	public LanguageStageManager(LanguageStageDao languageStageDao) 
	{
		super();
		this.languageStageDao = languageStageDao;
	}

	@Override
	public Result add(LanguageStage languageStage)
	{
		this.languageStageDao.save(languageStage);
		return new SuccessResult(Messages.languageStageAdded);
	}

	@Override
	public DataResult<List<LanguageStage>> getAll() 
	{
		return new SuccessDataResult<List<LanguageStage>>(this.languageStageDao.findAll() , Messages.languageStagesListed);
	}
	
	
}