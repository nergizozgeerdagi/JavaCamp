package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.SchoolAndDepartment;

public interface SchoolAndDepartmentDao extends JpaRepository<SchoolAndDepartment, Integer>
{

}