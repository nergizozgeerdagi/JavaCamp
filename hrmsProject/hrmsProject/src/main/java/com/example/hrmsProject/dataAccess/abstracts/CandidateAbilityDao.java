package com.example.hrmsProject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.CandidateAbility;

public interface CandidateAbilityDao extends JpaRepository<CandidateAbility, Integer>
{

	List<CandidateAbility> getByCandidate_Id(int candidateId);
	
}