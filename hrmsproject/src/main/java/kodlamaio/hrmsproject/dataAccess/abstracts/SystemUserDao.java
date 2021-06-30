package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsproject.entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer>
{

}