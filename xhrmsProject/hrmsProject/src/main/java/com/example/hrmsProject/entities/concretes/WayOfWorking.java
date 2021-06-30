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
@Table(name = "way_of_workings")
public class WayOfWorking 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "way_of_working_name")
	private String wayOfWorkingName;	

	@OneToMany(mappedBy = "wayOfWorking")
	@JsonIgnore
	private List<JobAdvertisement> jobAdvertisements;

	public WayOfWorking(int id, String wayOfWorkingName, List<JobAdvertisement> jobAdvertisements) {
		super();
		this.id = id;
		this.wayOfWorkingName = wayOfWorkingName;
		this.jobAdvertisements = jobAdvertisements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWayOfWorkingName() {
		return wayOfWorkingName;
	}

	public void setWayOfWorkingName(String wayOfWorkingName) {
		this.wayOfWorkingName = wayOfWorkingName;
	}

	public List<JobAdvertisement> getJobAdvertisements() {
		return jobAdvertisements;
	}

	public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}
	

}