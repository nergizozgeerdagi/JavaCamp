package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlamaio.hrmsproject.entities.concretes.ForeignLanguage;
import kodlamaio.hrmsproject.entities.dtos.ForeignLanguageDetailsDto;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer>
{
	   @Query
	   ("Select new kodlamaio.hrmsproject.entities.dtos.ForeignLanguageDetailsDto(fl.name, rfl.ratio) "
	   		+ "From ForeignLanguage fl JOIN fl.resumeForeignLanguages rfl Where rfl.resume.id = :id")
	   List<ForeignLanguageDetailsDto> findByResume_ResumeId(int id);
}