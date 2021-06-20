package com.example.hrmsProject.entities.dtos;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto 
{

	private int employerId;
	
	private int cityId;
	
	private int jobPositionId;
	
	private int wayOfWorkingId;
	
	private int workingTimeId;
	
	private int numberOfOpenPosition;
	
	private LocalDate applicationDeadline;
	
	private double minSalary;
	
	private double maxSalary;
	
	private String description;
	
}