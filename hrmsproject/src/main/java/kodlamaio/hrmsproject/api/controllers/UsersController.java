package kodlamaio.hrmsproject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.business.abstracts.UserService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController 
{
	
	private UserService userService;
	
	
	@Autowired
	public UsersController(UserService userService) 
	{
		super();
		this.userService = userService;
	}



	@GetMapping("/getall")
    public DataResult<List<User>> getAll()
	{
    	return userService.getAll();
    }
	
	
	@PostMapping("/verify")
	public Result verify(String email, String verifyCode) 
	{
		return userService.verifyUser(email, verifyCode);
	}
	
}