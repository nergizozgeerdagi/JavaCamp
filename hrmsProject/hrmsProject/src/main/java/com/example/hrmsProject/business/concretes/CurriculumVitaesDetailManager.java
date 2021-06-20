package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.CurriculumVitaesDetailService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.dataAccess.abstracts.CandidateAbilityDao;
import com.example.hrmsProject.dataAccess.abstracts.CandidateImageDao;
import com.example.hrmsProject.dataAccess.abstracts.CandidateSchoolWithDepartmentDao;
import com.example.hrmsProject.dataAccess.abstracts.JobExperienceDao;
import com.example.hrmsProject.dataAccess.abstracts.LanguageCandidateDao;
import com.example.hrmsProject.dataAccess.abstracts.SocialMediaAccountDao;
import com.example.hrmsProject.entities.concretes.CandidateAbility;
import com.example.hrmsProject.entities.concretes.CandidateImage;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;
import com.example.hrmsProject.entities.concretes.JobExperience;
import com.example.hrmsProject.entities.concretes.LanguageCandidate;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;

@Service
public class CurriculumVitaesDetailManager implements CurriculumVitaesDetailService
{

	private CandidateSchoolWithDepartmentDao candidateSchoolWithDepartmentDao;
	private LanguageCandidateDao languageCandidateDao;
	private CandidateAbilityDao candidateAbilityDao;
	private CandidateImageDao candidateImageDao;
	private JobExperienceDao jobExperienceDao;
	private SocialMediaAccountDao socialMediaAccountDao;
	
	@Autowired
	public CurriculumVitaesDetailManager(CandidateSchoolWithDepartmentDao candidateSchoolWithDepartmentDao,
			LanguageCandidateDao languageCandidateDao, CandidateAbilityDao candidateAbilityDao,
			CandidateImageDao candidateImageDao, JobExperienceDao jobExperienceDao,
			SocialMediaAccountDao socialMediaAccountDao)
	{
		super();
		this.candidateSchoolWithDepartmentDao = candidateSchoolWithDepartmentDao;
		this.languageCandidateDao = languageCandidateDao;
		this.candidateAbilityDao = candidateAbilityDao;
		this.candidateImageDao = candidateImageDao;
		this.jobExperienceDao = jobExperienceDao;
		this.socialMediaAccountDao = socialMediaAccountDao;
	}

	@Override
	public DataResult<List<CandidateSchoolWithDepartment>> getAllCandidateSchoolWithDepartmentByCandidateId
	(int candidateId) 
	{
		return new SuccessDataResult<List<CandidateSchoolWithDepartment>>
		(this.candidateSchoolWithDepartmentDao.getAllByCandidate_Id(candidateId));
	}

	@Override
	public DataResult<List<LanguageCandidate>> getAllLanguageCandidateByCandidateId(int candidateId) 
	{
		return new SuccessDataResult<List<LanguageCandidate>>(this.languageCandidateDao.getByCandidate_Id(candidateId));
	}

	@Override
	public DataResult<List<CandidateAbility>> getAllCandidateAbilityByCandidateId(int candidateId) 
	{
		return new SuccessDataResult<List<CandidateAbility>>(this.candidateAbilityDao.getByCandidate_Id(candidateId));
	}

	@Override
	public DataResult<List<CandidateImage>> getAllCandidateImageByCandidateId(int candidateId) 
	{
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.getByCandidate_Id(candidateId));
	}

	@Override
	public DataResult<List<JobExperience>> getAllJobExperienceByCandidateId(int candidateId) 
	{
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByCandidate_Id(candidateId));
	}

	@Override
	public DataResult<List<SocialMediaAccount>> getAllSocialMediaAccountByCandidateId(int candidateId) 
	{
		return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccountDao.getByCandidate_Id(candidateId));
	}

}