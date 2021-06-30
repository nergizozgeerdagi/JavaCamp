package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.ResumeSkillService;
import kodlamaio.hrmsproject.core.utilities.business.BusinessRules;
import kodlamaio.hrmsproject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.ResumeSkillDao;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.concretes.ResumeSkill;
import kodlamaio.hrmsproject.entities.dtos.SkillForAddDto;

@Service
public class ResumeSkillManager implements ResumeSkillService
{

	@Autowired
	ResumeSkillDao resumeSkillDao;
	
	@Override
	public Result addRange(List<SkillForAddDto> skills, Resume resume) 
	{
		for(SkillForAddDto skill : skills)
		{
			Result businessRules = BusinessRules.run(checkIfSkillExistsInDatabase(skill.getSkill().getId()));
			if(businessRules != null) return businessRules;
			
			ResumeSkill resumeSkill = new ResumeSkill
					(resume,skill.getSkill(), skill.getLevel());
			System.out.println(resumeSkill.getSkill());
			resumeSkillDao.save(resumeSkill);
		}
		
		return new SuccessResult();
	}
	
	private Result checkIfSkillExistsInDatabase(int skillId) 
	{
		
		if(resumeSkillDao.findById(skillId) == null)
		{
			return new ErrorResult();
		}
		
		return new SuccessResult();
	}

}