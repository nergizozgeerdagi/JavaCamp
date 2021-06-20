package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hrmsProject.entities.concretes.Employer;
@Repository

public interface EmployerDao extends JpaRepository<Employer,Integer> 
{

}