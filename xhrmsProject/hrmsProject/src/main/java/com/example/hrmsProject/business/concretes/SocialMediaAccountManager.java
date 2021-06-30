package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.SocialMediaAccountService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.SocialMediaAccountDao;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;

@Service
public class SocialMediaAccountManager implements SocialMediaAccountService
{

	private SocialMediaAccountDao socialMediaAccountDao;
	
	@Autowired
	public SocialMediaAccountManager(SocialMediaAccountDao socialMediaAccountDao) 
	{
		super();
		this.socialMediaAccountDao = socialMediaAccountDao;
	}

	public Result add(SocialMediaAccount socialMediaAccount) 
	{
		this.socialMediaAccountDao.save(socialMediaAccount);
		return new SuccessResult(Messages.socialMediaAccountAdded);
	}

	public DataResult<List<SocialMediaAccount>> getAll() 
	{
		return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccountDao.findAll() , Messages.socialMediaAccountListed);
	}

}