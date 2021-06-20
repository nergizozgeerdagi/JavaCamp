package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>
{
	
}