package com.example.hrmsProject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.CandidateSchoolWithDepartment;

public interface CandidateSchoolWithDepartmentDao extends JpaRepository<CandidateSchoolWithDepartment, Integer>
{
	
	List<CandidateSchoolWithDepartment> getAllByCandidateIdOrderByEndingDateDesc(int candidateId);
	List<CandidateSchoolWithDepartment>  getAllByCandidate_Id(int candidateId);
	List<CandidateSchoolWithDepartment>  getAllByOrderByEndingDateDesc();
	
}