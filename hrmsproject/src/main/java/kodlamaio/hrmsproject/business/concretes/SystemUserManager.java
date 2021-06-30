package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.SystemUserService;
import kodlamaio.hrmsproject.dataAccess.abstracts.SystemUserDao;
import kodlamaio.hrmsproject.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService 
{
	
   private SystemUserDao systemUserDao;
   
   @Autowired
   public SystemUserManager(SystemUserDao systemUserDao) 
   {
	   super();
	   this.systemUserDao = systemUserDao;
   }

   @Override
   public List<SystemUser> getAll() 
   {
	   return this.systemUserDao.findAll();
   }
   
}