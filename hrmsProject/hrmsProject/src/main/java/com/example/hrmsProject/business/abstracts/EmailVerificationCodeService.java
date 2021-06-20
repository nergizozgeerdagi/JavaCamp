package com.example.hrmsProject.business.abstracts;

import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.EmailVerificationCode;

public interface EmailVerificationCodeService 
{
	void createCode(EmailVerificationCode verificationCode , int userId);
	Result verifyCode(String verificationCode , int id);
}
