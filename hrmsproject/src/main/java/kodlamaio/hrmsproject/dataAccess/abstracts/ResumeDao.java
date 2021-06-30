package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.dtos.ResumeWithDetailsDto;

public interface ResumeDao extends JpaRepository<Resume, Integer>
{
	
	@Query("Select new kodlamaio.hrmsproject.entities.dtos.ResumeWithDetailsDto"
			+ "(r.id, r.githubAddress,r.linkedinAddress, r.coverLetter,r.picture,r.createDate,e)"
			+ "From Resume r JOIN r.employee e Where r.id=:id")
	ResumeWithDetailsDto getResumeWithDetailsById(int id);

}