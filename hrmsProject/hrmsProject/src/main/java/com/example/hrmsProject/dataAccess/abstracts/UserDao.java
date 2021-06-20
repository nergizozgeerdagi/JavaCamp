package com.example.hrmsProject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hrmsProject.entities.concretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>
{

	List<User> findAllByEmail(String email);

	List<String> getAllEmail();
	
}