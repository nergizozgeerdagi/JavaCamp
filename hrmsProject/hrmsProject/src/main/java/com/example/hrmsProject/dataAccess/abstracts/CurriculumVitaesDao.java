package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.CurriculumVitaes;

public interface CurriculumVitaesDao extends JpaRepository<CurriculumVitaes, Integer>
{

	CurriculumVitaes getByCandidate_Id(int candidateId);
	
}