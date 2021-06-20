package com.example.hrmsProject.business.abstracts;

import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.User;

public interface UserService 
{
	DataResult<List<User>> getAll();
	Result add(User user);
	DataResult<List<User>> getUserByEmail(String email);
}
