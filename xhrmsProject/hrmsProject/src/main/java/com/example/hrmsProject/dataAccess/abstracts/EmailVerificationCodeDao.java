package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrmsProject.entities.concretes.EmailVerificationCode;

public interface EmailVerificationCodeDao extends JpaRepository<EmailVerificationCode, Integer>
{

	EmailVerificationCode findByUserId(int userId);
	
}