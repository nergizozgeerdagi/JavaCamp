package com.example.hrmsProject.business.abstracts;

import java.time.LocalDate;
import java.util.List;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService 
{

	DataResult<List<JobAdvertisement>>getByIsActiveTrue();
	DataResult<List<JobAdvertisement>>getByEmployer_Id(int id);
	DataResult<List<JobAdvertisement>>getBylastOfAppealDateBetweenAndIsActive(LocalDate startDate, LocalDate finalDate, boolean activated);
	Result add(JobAdvertisement jobAdvertisement);
	Result deactivateJobAdvertisement(Integer id);
	
}