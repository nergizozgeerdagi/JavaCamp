package com.example.hrmsProject.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "candidates")
@AllArgsConstructor
public class Candidate {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surName;

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(int id, String name, String surName, @Size(min = 11, max = 11) String identityNumber,
			Date birth_date) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.identityNumber = identityNumber;
		this.birth_date = birth_date;
	}

	@Column(name = "identity_number")
	@Size(min = 11, max = 11)
	private String identityNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	@Column(name = "birth_date")
	private Date birth_date;

}
