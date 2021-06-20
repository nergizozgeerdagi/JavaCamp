package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.LanguageCandidateService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.LanguageCandidateDao;
import com.example.hrmsProject.entities.concretes.LanguageCandidate;

@Service
public class LanguageCandidateManager implements LanguageCandidateService
{

	private LanguageCandidateDao languageCandidateDao;
	
	@Autowired
	public LanguageCandidateManager(LanguageCandidateDao languageCandidateDao) 
	{
		super();
		this.languageCandidateDao = languageCandidateDao;
	}

	@Override
	public Result add(LanguageCandidate languageCandidate) 
	{
		this.languageCandidateDao.save(languageCandidate);
		return new SuccessResult(Messages.languageCandidateAdded);
	}

	@Override
	public DataResult<List<LanguageCandidate>> getAll() 
	{
		return new SuccessDataResult<List<LanguageCandidate>>(this.languageCandidateDao.findAll() , Messages.languageCandiddatesListed);
	}

}