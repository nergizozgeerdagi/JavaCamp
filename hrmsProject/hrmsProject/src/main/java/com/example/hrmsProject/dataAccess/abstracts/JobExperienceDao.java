package com.example.hrmsProject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>
{

	List<JobExperience> getByCandidate_Id(int candidateId);
	
	List<JobExperience> getAllByOrderByEndingDateDesc();
	
	List<JobExperience> getAllByCandidateIdOrderByEndingDateDesc(int candidateId);
	
}