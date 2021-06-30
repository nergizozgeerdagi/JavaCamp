package com.example.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "verification_codes")
public class EmailVerificationCode 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "id")
	private int id;
	
	@Column(name = "code")
	private String verificationCode;
	
	@Column(name = "is_verified")
	private boolean isVerified; 
	
	@Column(name = "user_id")
	private int userId;

	public void setVerificationCode(Object object)
	{
		// TODO Auto-generated method stub
		
	}

	public void setVerified(boolean b) 
	{
		// TODO Auto-generated method stub
		
	}

	public boolean isVerified() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	public void setUserId(int userId2) 
	{
		// TODO Auto-generated method stub
		
	}

	public Object getVerificationCode() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}