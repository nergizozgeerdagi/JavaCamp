package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.entities.concretes.SystemUser;

public interface SystemUserService 
{
	   List<SystemUser> getAll();
}