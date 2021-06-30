package com.example.hrmsProject.entities.dtos;

import java.util.List;

import com.example.hrmsProject.entities.concretes.Candidate;
import com.example.hrmsProject.entities.concretes.CandidateImage;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;
import com.example.hrmsProject.entities.concretes.CurriculumVitaes;
import com.example.hrmsProject.entities.concretes.JobExperience;
import com.example.hrmsProject.entities.concretes.LanguageCandidate;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitaesDetailDto 
{

	public CurriculumVitaesDetailDto(Candidate candidate2, List<CandidateSchoolWithDepartment> data,
			List<JobExperience> data2, List<LanguageCandidate> data3, 
			List<SocialMediaAccount> data5, List<CandidateImage> data6, CurriculumVitaes byCandidate_Id) 
	{
		// TODO Auto-generated constructor stub
	}

	@JsonIgnore
	private Candidate candidate;
	
	private List<CandidateSchoolWithDepartment> candidateSchoolWithDepartments;
	
	private List<JobExperience> jobExperiences;
	
	private List<LanguageCandidate> languageCandidates;
	
	//private List<CandidateAbility> candidateAbilities;
	
	private List<SocialMediaAccount> socialMediaAccounts;
	
	private List<CandidateImage> candidateImages;
	
	private CurriculumVitaes curriculumVitae; 
	
}