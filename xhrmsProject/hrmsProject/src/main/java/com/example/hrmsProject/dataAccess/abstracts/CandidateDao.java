package com.example.hrmsProject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hrmsProject.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate,Integer>  
{
	
	List<Candidate> findAllByEmail(String email);
	List<Candidate> findAllByIdentityNumber(String identityNumber);
	//List<String> getAllIdentityNumber();
	
}