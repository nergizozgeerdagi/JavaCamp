package com.example.hrmsProject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;

public interface SocialMediaAccountDao extends JpaRepository<SocialMediaAccount, Integer> 
{

	List<SocialMediaAccount> getByCandidate_Id(int candidateId);
	
}