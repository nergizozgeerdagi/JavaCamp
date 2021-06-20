package com.example.hrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidate_school_with_departmans")
public class CandidateSchoolWithDepartment 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@ManyToOne()
	@JoinColumn(name = "school_departments_id")
	private SchoolAndDepartment schoolAndDepartment;
	
	@Column(name = "starting_date")
	private LocalDate startingDate;
	
	@Column(name = "ending_date")
	private LocalDate endingDate;
	
}