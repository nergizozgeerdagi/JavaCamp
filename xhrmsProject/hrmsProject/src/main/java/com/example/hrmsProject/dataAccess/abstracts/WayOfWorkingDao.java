package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.WayOfWorking;

public interface WayOfWorkingDao extends JpaRepository< WayOfWorking, Integer>
{
	
}