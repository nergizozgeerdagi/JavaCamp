package com.example.hrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.UserService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.UserDao;
import com.example.hrmsProject.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	} 
	
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll() , "Data listelendi");
	}

	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult(Messages.userAdded);
	}

	public DataResult<List<User>> getUserByEmail(String email) {
	 return new SuccessDataResult<List<User>>(this.userDao.findAllByEmail(email) , Messages.usersListed);
	}

}