package com.example.hrmsProject.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="employers")
@AllArgsConstructor

public class Employer 
{
	public Employer() 
	{
	
	}
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="web_site")
	private String web_site;
	
	@Column(name="phone")
	private String phone;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getWeb_site() {
		// TODO Auto-generated method stub
		return null;
	}
}
