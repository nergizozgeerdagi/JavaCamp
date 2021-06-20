package com.example.hrmsProject.entities.concretes;

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
@Table(name = "candidate_images")
public class CandidateImage 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@Column(name = "image_url")
	private String imageUrl;

	public void setCandidate(Candidate candidate2) 
	{
		// TODO Auto-generated method stub
		
	}

	public void setImageUrl(String photoUrl) 
	{
		// TODO Auto-generated method stub
		
	}
}