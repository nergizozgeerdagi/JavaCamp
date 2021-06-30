package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlamaio.hrmsproject.entities.concretes.Skill;
import kodlamaio.hrmsproject.entities.dtos.SkillDetailsDto;

public interface SkillDao extends JpaRepository<Skill, Integer>
{
    @Query("Select new kodlamaio.hrmsproject.entities.dtos.SkillDetailsDto"
    		+ "(s.name,rs.level) "
    		+ "From Skill s Join s.resumeSkills rs Where rs.resume.id=:id")
    List<SkillDetailsDto> findByResume_ResumeId(int id);
}