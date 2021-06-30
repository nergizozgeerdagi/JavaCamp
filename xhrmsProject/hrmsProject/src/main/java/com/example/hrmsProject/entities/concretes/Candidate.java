package com.example.hrmsProject.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "candidates")
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{
	

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surName;

	@ManyToOne
	@JoinColumn(name="ability_id",referencedColumnName="id")
	private Ability ability;

	@Column(name = "identity_number")
	@Size(min = 11, max = 11)
	private String identityNumber;
	
	@Column(name = "birth_date")	
	private Date birth_date;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidate")
	private CandidateImage candidateImage;
	
	public Candidate()
	 {
		super();
	 }

	

	public Candidate(String name, String surName, Ability ability,
			String identityNumber, Date birth_date,CandidateImage candidateImage) {
		super();
		this.name = name;
		this.surName = surName;
		this.ability = ability;
		this.identityNumber = identityNumber;
		this.birth_date = birth_date;
		this.candidateImage=candidateImage;
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


	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}



	public CandidateImage getCandidateImage() {
		return candidateImage;
	}



	public void setCandidateImage(CandidateImage candidateImage) {
		this.candidateImage = candidateImage;
	}

}
