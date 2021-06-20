package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.LanguageStage;

public interface LanguageStageDao extends JpaRepository<LanguageStage, Integer>
{

}