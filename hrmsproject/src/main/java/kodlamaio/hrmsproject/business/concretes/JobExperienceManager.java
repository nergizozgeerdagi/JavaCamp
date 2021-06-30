package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.JobExperienceService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrmsproject.entities.concretes.JobExperience;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.dtos.JobExperienceForAddDto;

@Service
public class JobExperienceManager implements JobExperienceService
{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) 
	{
		super();
		this.jobExperienceDao = jobExperienceDao;
	}


	@Override
	public DataResult<List<JobExperience>> findByResume_Id(int id) 
	{
		return new SuccessDataResult<List<JobExperience>>(jobExperienceDao.findByResume_IdOrderByEndDateDesc(id));
	}


	@Override
	public Result add(JobExperienceForAddDto jobExperience,Resume resume)
	{
		JobExperience jobExperienceToAdd = new JobExperience(jobExperience.getOfficeName(),
				jobExperience.getPosition(), 
				jobExperience.getStartDate(),
				jobExperience.getEndDate(),
				resume);
		jobExperienceDao.save(jobExperienceToAdd);
		return new SuccessResult();
	}


	@Override
	public Result addRange(List<JobExperienceForAddDto> jobExperiences, Resume resume)
	{
		for(JobExperienceForAddDto jobExperience : jobExperiences) 
		{
			JobExperience jobExperienceToAdd = new JobExperience(jobExperience.getOfficeName(),
					jobExperience.getPosition(), 
					jobExperience.getStartDate(),
					jobExperience.getEndDate(),
					resume);
			jobExperienceDao.save(jobExperienceToAdd);	
		}
		return new SuccessResult();
	}

}