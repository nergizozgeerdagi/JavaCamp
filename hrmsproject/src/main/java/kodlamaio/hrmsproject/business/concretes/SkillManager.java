package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.SkillService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.SkillDao;
import kodlamaio.hrmsproject.entities.concretes.Skill;
import kodlamaio.hrmsproject.entities.dtos.SkillDetailsDto;

@Service
public class SkillManager implements SkillService 
{

	private SkillDao skillDao;
	
	@Autowired
	public SkillManager(SkillDao skillDao) 
	{
		super();
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<List<SkillDetailsDto>> findByResume_Id(int id) 
	{
		return new SuccessDataResult<List<SkillDetailsDto>>(skillDao.findByResume_ResumeId(id));
	}

	@Override
	public DataResult<Skill> findById(int id) 
	{
		Skill skill = skillDao.getOne(id);
		if(skill==null) return new ErrorDataResult<Skill>();
		return new SuccessDataResult<Skill>(skill);
	}

}