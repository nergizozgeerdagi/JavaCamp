package com.example.hrmsProject.business.concretes;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.JobAdvertisementService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrmsProject.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService
{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) 
	{
		this.jobAdvertisementDao=jobAdvertisementDao;
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() 
	{
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveTrue(),"Aktif iş ilanlari başarıyla alındı!");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer_Id(int id) 
	{
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByEmployer_Id(id),"Employer Id'ye göre listeleme yapıldı.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getBylastOfAppealDateBetweenAndIsActive(LocalDate startDate,
			LocalDate finalDate, boolean activated) 
	{
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getBylastOfAppealDateBetweenAndIsActive(startDate, finalDate, activated),
				"Tarih durumuna göre listeleme yapıldı.");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) 
	{
		// TODO Auto-generated method stub
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job Advertisement eklendi");
	}

	@Override
	public Result deactivateJobAdvertisement(Integer id) 
	{
		JobAdvertisement jobAdvertisement = this.jobAdvertisementDao.findById(id).get();
		jobAdvertisement.setActive(false);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("deActivated");
	}
	

}