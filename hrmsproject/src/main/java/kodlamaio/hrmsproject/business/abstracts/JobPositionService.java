package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobPosition;

public interface JobPositionService 
{
	DataResult<List<JobPosition>> getAll();
    DataResult<JobPosition> getByPositionName(String positionName);
    DataResult<JobPosition> getById(int id);
    Result addNew(JobPosition jobPosition);
}