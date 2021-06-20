package com.example.hrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsProject.business.abstracts.EmailVerificationCodeService;
import com.example.hrmsProject.core.utilities.results.Result;

@RestController
@RequestMapping("/api/verify/")
@CrossOrigin
public class EmailVerificationCodesController 
{

	private EmailVerificationCodeService emailVerificationService;

	@Autowired
	public EmailVerificationCodesController(EmailVerificationCodeService emailVerificationService) 
	{
		super();
		this.emailVerificationService = emailVerificationService;
	}
	
	@PostMapping("update/{verificationCode}/{id}")
	public Result setVerify(@RequestParam String verificationCode,@RequestParam Integer id)
	{
		return this.emailVerificationService.verifyCode(verificationCode, id);
	}
	
}