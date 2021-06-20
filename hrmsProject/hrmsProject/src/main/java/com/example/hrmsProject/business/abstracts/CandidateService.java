package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.entities.concretes.Candidate;

public interface CandidateService 
{

	boolean candidateUserControl(Candidate candidate);
	boolean candidateIdentityControl(Candidate candidate);
	boolean candidateUserEmailControl();
	List<Candidate> getCandidates();
	
}