package com.example.hrmsProject.entities.concretes;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends User
{
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Override
	public Object getEMail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}