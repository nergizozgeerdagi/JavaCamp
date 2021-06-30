package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobExperience;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.dtos.JobExperienceForAddDto;

public interface JobExperienceService 
{
	DataResult<List<JobExperience>> findByResume_Id(int id);
	Result add(JobExperienceForAddDto jobExperience,Resume resume);
	Result addRange(List<JobExperienceForAddDto> jobExperiences, Resume resume);
}