package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.WorkingTime;

public interface WorkingTimeDao extends JpaRepository<WorkingTime, Integer>
{
	
}