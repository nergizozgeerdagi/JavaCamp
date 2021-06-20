package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.Workplace;

public interface WorkplaceDao extends JpaRepository<Workplace, Integer>
{

}