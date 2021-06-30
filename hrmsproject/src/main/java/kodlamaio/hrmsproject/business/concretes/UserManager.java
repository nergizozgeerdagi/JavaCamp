package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.UserService;
import kodlamaio.hrmsproject.core.utilities.email.EmailService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.UserDao;
import kodlamaio.hrmsproject.entities.concretes.User;

@Service
public class UserManager implements UserService
{
	
	private UserDao userDao;
	private EmailService emailService;
	
	@Autowired
	public UserManager(UserDao userDao,EmailService emailService) 
	{
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public DataResult<List<User>> getAll() 
	{
			return new SuccessDataResult<List<User>>( userDao.findAll() );
	}

	@Override
	public DataResult<User> getByEmail(String email)
	{
		return new SuccessDataResult<User>(userDao.findByEmail(email));
	}

	@Override
	public Result add(User user) 
	{
		this.userDao.save(user);
		this.emailService.send(user.getEmail(), 
				"Doğrulama Linki", 
				"HRMS Sistemine hoşgeldiniz. "
				+ "Aşağıdaki linke tıklayarak üyeliğinizi doğrulayabilirsiniz \n "
				+ "www.localhost:1616/api/users/verify?email=" + user.getEmail() + "&verifycode=" + user.getEmailVerifyCode());
		return new SuccessResult();
	}

	@Override
	public Result verifyUser(String email, String verificationCode) 
	{
		User user = userDao.findByEmailAndEmailVerifyCode(email, verificationCode);
		if(user == null)
			return new ErrorResult("Doğrulama başarısız lütfen bilgileri doğru giriniz!");
		
		user.setEmailVerified(true);
		userDao.save(user);
		return new SuccessResult("Kullanıcı e-postası başarıyla doğrulandı.");
	}
 
}