package com.example.hrmsProject.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.example.hrmsProject.business.abstracts.JobExperienceService;



@Entity
@Table(name="job_advertisement")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class JobAdvertisement 
{
	
	

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	
	@Column(name="job_description")
	private String job_description;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
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
	@JoinColumn(name="job_id",referencedColumnName = "id")
	private JobExperience jobExperience;
	
	@ManyToOne
	@JoinColumn(name="employer_id",referencedColumnName="id")
	private Employer employer;

	@ManyToOne
	@JoinColumn(name="jobPosition_id",referencedColumnName="id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name="wayOfWorking_id",referencedColumnName="id")
	private WayOfWorking wayOfWorking;
	
	@ManyToOne
	@JoinColumn(name="workingTime_id",referencedColumnName="id")
	private WorkingTime workingTime;
	
	public JobExperience getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(JobExperience jobExperience) {
		this.jobExperience = jobExperience;
	}

	public JobAdvertisement() {
		super();
	}

	public JobAdvertisement(int id, JobExperience jobExperience, String job_description, Cities cities,
			int minSalaryScale, int maxSalaryScale, int numberOfOpenPosition, Date lastOfAppealDate, boolean isActive,
			Date adDate, Employer employer, JobPosition jobPosition, WayOfWorking wayOfWorking,WorkingTime workingTime) {
		super();
		this.id = id;
		this.jobExperience= jobExperience;
		this.job_description = job_description;
		this.cities = cities;
		this.minSalaryScale = minSalaryScale;
		this.maxSalaryScale = maxSalaryScale;
		this.numberOfOpenPosition = numberOfOpenPosition;
		this.lastOfAppealDate = lastOfAppealDate;
		this.isActive = isActive;
		this.adDate = adDate;
		this.employer = employer;
		this.jobPosition = jobPosition;
		this.wayOfWorking = wayOfWorking;
		this.workingTime=workingTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}

	public Cities getCities() {
		return cities;
	}

	public void setCities(Cities cities) {
		this.cities = cities;
	}

	public int getMinSalaryScale() {
		return minSalaryScale;
	}

	public void setMinSalaryScale(int minSalaryScale) {
		this.minSalaryScale = minSalaryScale;
	}

	public int getMaxSalaryScale() {
		return maxSalaryScale;
	}

	public void setMaxSalaryScale(int maxSalaryScale) {
		this.maxSalaryScale = maxSalaryScale;
	}

	public int getNumberOfOpenPosition() {
		return numberOfOpenPosition;
	}

	public void setNumberOfOpenPosition(int numberOfOpenPosition) {
		this.numberOfOpenPosition = numberOfOpenPosition;
	}

	public Date getLastOfAppealDate() {
		return lastOfAppealDate;
	}

	public void setLastOfAppealDate(Date lastOfAppealDate) {
		this.lastOfAppealDate = lastOfAppealDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getAdDate() {
		return adDate;
	}

	public void setAdDate(Date adDate) {
		this.adDate = adDate;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}

	public WayOfWorking getWayOfWorking() {
		return wayOfWorking;
	}

	public void setWayOfWorking(WayOfWorking wayOfWorking) {
		this.wayOfWorking = wayOfWorking;
	}

	public WorkingTime getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(WorkingTime workingTime) {
		this.workingTime = workingTime;
	}
	

}