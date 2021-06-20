package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.SocialMediaAccountService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.SocialMediaAccount;

@RestController
@RequestMapping("/api/socialMediaAccounts/")
@CrossOrigin
public class SocialMediaAccountsController 
{

	private SocialMediaAccountService socialMediaAccountService;

	@Autowired
	public SocialMediaAccountsController(SocialMediaAccountService socialMediaAccountService) 
	{
		super();
		this.socialMediaAccountService = socialMediaAccountService;
	}
	
	@GetMapping("getall")
	public DataResult<List<SocialMediaAccount>> getAll()
	{
		return this.socialMediaAccountService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody SocialMediaAccount socialMediaAccount) 
	{
		return this.socialMediaAccountService.add(socialMediaAccount);
	}
	
}