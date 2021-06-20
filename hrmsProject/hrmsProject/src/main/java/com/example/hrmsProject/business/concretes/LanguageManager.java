package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.LanguageService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.LanguageDao;
import com.example.hrmsProject.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService
{

	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) 
	{
		super();
		this.languageDao = languageDao;
	}

	@Override
	public Result add(Language language) 
	{
		this.languageDao.save(language);
		return new SuccessResult(Messages.languageAdded);
	}

	@Override
	public DataResult<List<Language>> getAll() 
	{
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll() , Messages.languagesListed);
	}
}