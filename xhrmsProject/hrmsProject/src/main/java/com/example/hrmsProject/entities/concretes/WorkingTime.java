package com.example.hrmsProject.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "working_times")
public class WorkingTime 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "working_time_name")
	private String workingTimeName;
	
	@OneToMany(mappedBy = "workingTime")
	@JsonIgnore//bunu görmemeni sağlıyor
	private List<JobAdvertisement> jobAdvertisements;

	public WorkingTime(int id, String workingTimeName, List<JobAdvertisement> jobAdvertisements) {
		super();
		this.id = id;
		this.workingTimeName = workingTimeName;
		this.jobAdvertisements = jobAdvertisements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkingTimeName() {
		return workingTimeName;
	}

	public void setWorkingTimeName(String workingTimeName) {
		this.workingTimeName = workingTimeName;
	}

	public List<JobAdvertisement> getJobAdvertisements() {
		return jobAdvertisements;
	}

	public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}

}