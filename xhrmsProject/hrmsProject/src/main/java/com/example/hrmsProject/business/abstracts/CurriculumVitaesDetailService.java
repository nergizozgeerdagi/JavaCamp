package com.example.hrmsProject.business.abstracts;

import java.util.List;

import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.entities.concretes.CandidateImage;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;
import com.example.hrmsProject.entities.concretes.JobExperience;
import com.example.hrmsProject.entities.concretes.LanguageCandidate;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;

public interface CurriculumVitaesDetailService 
{
	
	DataResult<List<CandidateSchoolWithDepartment>> getAllCandidateSchoolWithDepartmentByCandidateId(int candidateId);
	DataResult<List<LanguageCandidate>> getAllLanguageCandidateByCandidateId(int candidateId);
	//DataResult<List<CandidateAbility>> getAllCandidateAbilityByCandidateId(int candidateId);
	DataResult<List<CandidateImage>> getAllCandidateImageByCandidateId(int candidateId);
	DataResult<List<JobExperience>> getAllJobExperienceByCandidateId(int candidateId);
	DataResult<List<SocialMediaAccount>> getAllSocialMediaAccountByCandidateId(int candidateId);

}
