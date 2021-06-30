package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsproject.entities.concretes.ResumeForeignLanguage;

public interface ResumeForeignLanguageDao extends JpaRepository<ResumeForeignLanguage, Integer>
{

}