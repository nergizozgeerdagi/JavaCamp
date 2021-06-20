package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.CurriculumVitaesDetailService;
import com.example.hrmsProject.business.abstracts.CurriculumVitaesService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.CurriculumVitaesDao;
import com.example.hrmsProject.entities.concretes.Candidate;
import com.example.hrmsProject.entities.concretes.CandidateAbility;
import com.example.hrmsProject.entities.concretes.CandidateImage;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;
import com.example.hrmsProject.entities.concretes.CurriculumVitaes;
import com.example.hrmsProject.entities.concretes.JobExperience;
import com.example.hrmsProject.entities.concretes.LanguageCandidate;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;
import com.example.hrmsProject.entities.dtos.CurriculumVitaesDetailDto;

@Service
public class CurriculumVitaesManager implements CurriculumVitaesService 
{

	private CurriculumVitaesDao curriculumVitaeDao;
	private CurriculumVitaesDetailService curriculumVitaeDetailService;
	
	@Autowired
	public CurriculumVitaesManager(CurriculumVitaesDao curriculumVitaeDao,
			CurriculumVitaesDetailService curriculumVitaeDetailService) 
	{
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
		this.curriculumVitaeDetailService = curriculumVitaeDetailService;
	}

	@Override
	public Result add(CurriculumVitaes curriculumVitae) 
	{
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult(Messages.curriculumVitaeAdded);
	}

	@Override
	public DataResult<CurriculumVitaesDetailDto> getCurriculumVitaeByCandidateId(int candidateId) 
	{
		Candidate candidate = new Candidate();
		candidate.setId(candidateId);
		CurriculumVitaesDetailDto curriculumVitaeDetailDto = new CurriculumVitaesDetailDto
				
				(candidate,
				this.getAllSchoolByCandidateId(candidateId).getData(),
				this.getAllJobExperienceByCandidateId(candidateId).getData(),
				this.getAllLanguageCandidateByCandidateId(candidateId).getData(),
				this.getAllCandidateAbilityByCandidateId(candidateId).getData(),
				this.getAllSocialMediaAccountByCandidateId(candidateId).getData(),
				this.getAllCandidateImageByCandidateId(candidateId).getData(),
				this.curriculumVitaeDao.getByCandidate_Id(candidateId));
		
		return new SuccessDataResult<CurriculumVitaesDetailDto>(curriculumVitaeDetailDto , Messages.curriculumVitaesListed);
	}

	

	@Override
	public DataResult<List<CandidateSchoolWithDepartment>> getAllSchoolByCandidateId(int candidateId)
	{
		return this.curriculumVitaeDetailService.getAllCandidateSchoolWithDepartmentByCandidateId(candidateId);
	}

	@Override
	public DataResult<List<LanguageCandidate>> getAllLanguageCandidateByCandidateId(int candidateId) 
	{
		return this.curriculumVitaeDetailService.getAllLanguageCandidateByCandidateId(candidateId);
	}

	@Override
	public DataResult<List<CandidateAbility>> getAllCandidateAbilityByCandidateId(int candidateId) 
	{
		return this.curriculumVitaeDetailService.getAllCandidateAbilityByCandidateId(candidateId);
	}

	@Override
	public DataResult<List<JobExperience>> getAllJobExperienceByCandidateId(int candidateId) 
	{
		return this.curriculumVitaeDetailService.getAllJobExperienceByCandidateId(candidateId);
	}

	@Override
	public DataResult<List<CandidateImage>> getAllCandidateImageByCandidateId(int candidateId) 
	{
		return this.curriculumVitaeDetailService.getAllCandidateImageByCandidateId(candidateId);
	}

	@Override
	public DataResult<List<SocialMediaAccount>> getAllSocialMediaAccountByCandidateId(int candidateId)
	{
		return this.curriculumVitaeDetailService.getAllSocialMediaAccountByCandidateId(candidateId);
	}

}
