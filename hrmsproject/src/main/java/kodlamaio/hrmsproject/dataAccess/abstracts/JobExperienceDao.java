package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsproject.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> 
{
    List<JobExperience> findByResume_IdOrderByEndDateDesc(int id);
}