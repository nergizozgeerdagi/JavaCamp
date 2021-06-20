package com.example.hrmsProject.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cities")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class Cities 
{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="city_name")
	private String city_name;
	
	@OneToMany(mappedBy="cities")
	private List<JobAdvertisement>jobAdvertisement;

	

	public Object getCityName() 
	{
		// TODO Auto-generated method stub
		return null;
	}




}