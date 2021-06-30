package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.dtos.ResumeForAddDto;
import kodlamaio.hrmsproject.entities.dtos.ResumeWithDetailsDto;

public interface ResumeService 
{
	DataResult<ResumeWithDetailsDto> getResumeWithDetails(int id);
	DataResult<List<Resume>> getAll();
	Result add(ResumeForAddDto resume);
}