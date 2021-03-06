package kodlamaio.hrmsproject.business.concretes;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.CityService;
import kodlamaio.hrmsproject.business.abstracts.EmployerService;
import kodlamaio.hrmsproject.business.abstracts.JobAdvertisementService;
import kodlamaio.hrmsproject.business.abstracts.JobPositionService;
import kodlamaio.hrmsproject.core.utilities.business.BusinessRules;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrmsproject.entities.concretes.JobAdvertisement;
import kodlamaio.hrmsproject.entities.dtos.JobAdvertisementForAddDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService 
{

	private JobAdvertisementDao jobAdvertisementDao;
	private EmployerService employerService;
	private JobPositionService jobPositionService;
	private CityService cityService;


    @Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, EmployerService employerService,
			JobPositionService jobPositionService, CityService cityService)
    {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.employerService = employerService;
		this.jobPositionService = jobPositionService;
		this.cityService = cityService;
	}


	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrue() 
	{
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByIsActiveTrue());
	}



	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreateDate() 
	{
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByIsActiveTrueOrderByCreateDate());
	}



	@Override
	public DataResult<List<JobAdvertisement>> findByEmployer_EmployerId(int employerId)
	{
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByIsActiveTrueAndEmployer_UserId(employerId));
	}



	@Override
	public Result addNew(JobAdvertisementForAddDto jobAdvertisement) 
	{
		Result businessRulesResult = BusinessRules.run
				(isJobPositionValid(jobAdvertisement.getJobPositionId()),
				isJobDescValid(jobAdvertisement.getJobDescription()),
				isCityValid(jobAdvertisement.getCityId()),
				isOpenPositionValid(jobAdvertisement.getOpenPositionCount()),
				isEndDateValid(jobAdvertisement.getLastApplyDate()));
		if ( businessRulesResult != null ) return businessRulesResult;
		
// Bu k??s??m authenticationdan gelmeli hen??z i??lemedik o y??zden el atamas??yla yapaca????m
		
		if(!employerService.getById(jobAdvertisement.getEmployerId()).isSuccess())
		{
			return new ErrorResult("Bu isimde bir i?? veren firma mevcut de??il!");
		}
		
		
		//Automapper entegrasyonu ile ??ok daha clean olur :)
		
		JobAdvertisement jobAdvertisementToAdd = new JobAdvertisement
				(jobAdvertisement.getJobDescription(), 
				jobAdvertisement.getMinSalary(), 
				jobAdvertisement.getMaxSalary(), 
				jobAdvertisement.getOpenPositionCount(), 
				jobAdvertisement.getLastApplyDate(), 
				new Date(), 
				jobAdvertisement.isActive());
		jobAdvertisementToAdd.setCity(cityService.getById(jobAdvertisement.getCityId()).getData());
		jobAdvertisementToAdd.setJobPosition(jobPositionService.getById(jobAdvertisement.getJobPositionId()).getData());
		jobAdvertisementToAdd.setEmployer(employerService.getById(jobAdvertisement.getEmployerId()).getData());
		jobAdvertisementDao.save(jobAdvertisementToAdd);
		
		return new SuccessResult("???? ilan?? ba??ar?? ile olu??turuldu.");
	}
	

	@Override
	public Result changeStatus(int advertisementId, int employerId) 
	{
		JobAdvertisement jobAdvertisementToUpdate = jobAdvertisementDao.findByIdAndEmployer_UserId(advertisementId, employerId);
		if(jobAdvertisementToUpdate==null) return new ErrorResult
				("Bu kriterlere uyan bir i?? ilan?? sistemde mevcut de??il. B??yle bir i?? ilan?? yok ya da girdi??iniz i?? ilan?? bu ??irkete ait de??il!");
		jobAdvertisementToUpdate.setActive(!jobAdvertisementToUpdate.isActive());
		jobAdvertisementDao.save(jobAdvertisementToUpdate);
		return new SuccessResult("Belirtilen i?? ilan?? " + (jobAdvertisementToUpdate.isActive() ? "aktif" : "pasif") + " hale getirildi.");
	}
	
	private Result isJobPositionValid(int id) 
	{
		if(id<=0) return new ErrorResult("???? pozisyonu do??ru girilmedi.");
		if(jobPositionService.getById(id).getData() == null) return new ErrorResult("Girilen i?? pozisyonu mevcut de??il!");
		return new SuccessResult();
	}
	
	private Result isJobDescValid(String jobDesc) 
	{
		if(jobDesc == null || jobDesc.equals("")) return new ErrorResult("???? a????klamas?? do??ru girilmedi!");
		return new SuccessResult();
	}
	
	private Result isCityValid(int id)
	{
		if(id<=0) return new ErrorResult("??ehir do??ru girilmedi.");
		if(cityService.getById(id).getData() == null) return new ErrorResult("B??yle bir ??ehir bulunamad??.");
		return new SuccessResult();
	}
	
	private Result isOpenPositionValid(int count) 
	{
		if(count<=0) return new ErrorResult("A????k i?? pozisyonu 0 olamaz, 0'dan k??????k olamaz!");
		return new SuccessResult();
	}
	
	private Result isEndDateValid(Date endDate) 
	{

		if(new Date().compareTo(endDate) > 0) 
		{
			return new ErrorResult("Son ba??vuru tarihi i?? ilan?? tarihinden ??nce tarihe sahip olamaz!");
		}
		return new SuccessResult();
	}
	
}