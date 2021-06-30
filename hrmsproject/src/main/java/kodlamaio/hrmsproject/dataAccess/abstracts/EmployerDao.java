package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsproject.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>
{
	
}