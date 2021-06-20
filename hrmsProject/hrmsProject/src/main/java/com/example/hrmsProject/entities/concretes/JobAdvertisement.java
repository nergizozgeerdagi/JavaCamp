package com.example.hrmsProject.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.example.hrmsProject.business.abstracts.JobExperienceService;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_advertisement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement 
{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JoinColumn(name="job_id",referencedColumnName = "id")
	private JobExperienceService jobTitleService;
	
	@Column(name="job_description")
	private String job_description;
	
    @JoinColumn(name="city_id",referencedColumnName = "id")
	private Cities cities;
	
	@Column(name="min_salary_scale")
	private int minSalaryScale;
	
	@Column(name="max_salary_scale")
	private int maxSalaryScale;
	
	@Column(name="number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name="last_of_appeal_date")
	private Date lastOfAppealDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="ad_date")
	private Date adDate;
	
	@ManyToOne
	@JoinColumn(name="employer_id",referencedColumnName="id")
	private Employer employer;

	public void setActive(boolean b) 
	{
		// TODO Auto-generated method stub
		
	}

}