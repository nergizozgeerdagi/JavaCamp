package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.UserService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.User;


@RestController
@RequestMapping("/api/users/")
@CrossOrigin
public class UsersController 
{

	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) 
	{
		this.userService = userService;
	}
	
	@GetMapping("getall")
	public DataResult<List<User>> getAll()
	{
		return this.userService.getAll();
	}
	
	@GetMapping("getbyemail")
	public DataResult<List<User>> getByEmail(String email)
	{
	  return this.userService.getUserByEmail(email);
	}
	
	
	
	@PostMapping("add")
	public Result add(@RequestBody User user)
	{
		return this.userService.add(user);
	}
	
	
}