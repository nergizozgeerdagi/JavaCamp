package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.CandidateAbility;
import com.example.hrmsProject.entities.concretes.CandidateImage;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;
import com.example.hrmsProject.entities.concretes.CurriculumVitaes;
import com.example.hrmsProject.entities.concretes.JobExperience;
import com.example.hrmsProject.entities.concretes.LanguageCandidate;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;
import com.example.hrmsProject.entities.dtos.CurriculumVitaesDetailDto;

public interface CurriculumVitaesService 
{

	Result add(CurriculumVitaes curriculumVitae);
	DataResult<CurriculumVitaesDetailDto> getCurriculumVitaeByCandidateId(int candidateId);
	DataResult<List<CandidateSchoolWithDepartment>> getAllSchoolByCandidateId(int candidateId);
	DataResult<List<LanguageCandidate>> getAllLanguageCandidateByCandidateId(int candidateId);
	DataResult<List<CandidateAbility>> getAllCandidateAbilityByCandidateId(int candidateId);
	DataResult<List<JobExperience>> getAllJobExperienceByCandidateId(int candidateId);
	DataResult<List<CandidateImage>> getAllCandidateImageByCandidateId(int candidateId);
	DataResult<List<SocialMediaAccount>> getAllSocialMediaAccountByCandidateId(int candidateId);
	
}
