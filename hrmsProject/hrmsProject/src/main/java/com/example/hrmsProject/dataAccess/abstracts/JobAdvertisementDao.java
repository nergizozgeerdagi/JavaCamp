package com.example.hrmsProject.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsProject.entities.concretes.JobAdvertisement;

@Repository
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> 
{
	
	List<JobAdvertisement>getByIsActiveTrue();
	
	List<JobAdvertisement>getByEmployer_Id(int id);
	
	List<JobAdvertisement>getBylastOfAppealDateBetweenAndIsActive(LocalDate startDate,LocalDate finalDate,boolean activated);

	List<JobAdvertisement> findByActiveFalse();
	
}
