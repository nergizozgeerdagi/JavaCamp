package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.entities.concretes.Skill;
import kodlamaio.hrmsproject.entities.dtos.SkillDetailsDto;

public interface SkillService 
{
	DataResult<List<SkillDetailsDto>> findByResume_Id(int id);
	DataResult<Skill> findById(int id);
}