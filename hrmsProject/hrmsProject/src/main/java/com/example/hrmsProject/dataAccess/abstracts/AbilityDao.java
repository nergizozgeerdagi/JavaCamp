package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.Ability;

public interface AbilityDao extends JpaRepository<Ability, Integer>
{

}