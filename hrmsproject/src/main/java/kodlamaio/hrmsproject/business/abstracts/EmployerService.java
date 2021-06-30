package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.Employer;
import kodlamaio.hrmsproject.entities.dtos.EmployerForRegisterDto;

public interface EmployerService 
{
	   DataResult<List<Employer>> getAll();
	   DataResult<Employer> getById(int id);
	   Result register(EmployerForRegisterDto employer);
}