package com.example.hrmsProject.entities.concretes;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User
{
	
	
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
	
	@JsonIgnore
    @OneToMany(mappedBy = "employer") 
	List<JobAdvertisement> jobAdvertisement;

	
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


	public String getWeb_site() {
		return web_site;
	}


	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public List<JobAdvertisement> getJobAdvertisement() {
		return jobAdvertisement;
	}


	public void setJobAdvertisement(List<JobAdvertisement> jobAdvertisement) {
		this.jobAdvertisement = jobAdvertisement;
	}


	
}
