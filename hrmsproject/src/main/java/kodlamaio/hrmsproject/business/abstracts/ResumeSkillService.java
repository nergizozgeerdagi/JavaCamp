package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.dtos.SkillForAddDto;

public interface ResumeSkillService 
{
    Result addRange(List<SkillForAddDto> skills,Resume resume);
}
