package com.example.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.CandidateService;
import com.example.hrmsProject.business.abstracts.UserService;
import com.example.hrmsProject.core.utilities.results.ErrorResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.entities.concretes.Candidate;
import com.example.hrmsProject.entities.concretes.User;
import com.example.hrmsProject.dataAccess.abstracts.CandidateDao;
import com.example.hrmsProject.dataAccess.abstracts.UserDao;

@Service
public class CandidateManager implements CandidateService
{
	
	private CandidateDao candidateDao;
	private UserService userService;

	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserService userService) {
		super();
		this.candidateDao = candidateDao;
		this.userService = userService;
	}

	//bos birakilan alan kontrol
	
	@Override
	public boolean candidateUserControl(Candidate candidate) {
		if(candidate.getName() !=null || candidate.getSurName() !=null || candidate.getIdentityNumber() !=null 
				|| candidate.getEmail() !=null || candidate.getPassword() !=null) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	//Candidate identity number daha önce eklendi mi kontrol

	@Override
	public boolean candidateIdentityControl(Candidate candidate) 
	{
		
		/*candidateIdentityList=this.candidateDao.getAllIdentity();
		
		if(candidateIdentityList.contains(candidate.getIdentityNumber()))
		{
			return false;
		}
		else 
		{
			return true;
		}*/
		return true;
	}

	//Candidate mail daha önce eklendi mi kontrol 
	
	
	/*private Result candidateUserEmailControl(String email) 
	{
		if(this.candidateDao.findAllByEmail(email).stream().count()!=0)
		{
			return new ErrorResult("Bu email zaten mevcut");
		}
		return new SuccessResult();
		
	}*/

	@Override
	public List<Candidate> getCandidates() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
