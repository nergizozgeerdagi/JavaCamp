package CommerceBackend.Business.Concretes;
import java.util.List;

import CommerceBackend.Business.Abstracts.UserService;
import CommerceBackend.Core.Abstracts.SignUpService;
import CommerceBackend.DataAccess.Abstracts.UserDao;
import CommerceBackend.Entities.Concretes.Users;

public class UserManager implements UserService
{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) 
	{
		super();
		this.userDao = userDao;
	}
	
	AuthManager authManager = new AuthManager();
	
	@Override
	public void signUp(Users user) {
		if(authManager.userIsValid(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword())) 
		{
			userDao.add(user);
			authManager.sendConfirmMail();
		}
		
	}

	@Override
	public void signUpWithAnotherService(String email, String password, SignUpService signUpService) 
	{
		signUpService.SignUpWithAnotherAccount(email, password);
		authManager.sendConfirmMail();
		
	}

	@Override
	public void login(String email, String password) 
	{
		if(userDao.getUsers(email, password) !=null) 
		{
			System.out.println("Giriþ baþarýyla yapýldý! ");
		}
		else 
		{
			System.out.println("parola veya þifre hatalý girildi");
		}
		
	}

	@Override
	public List<Users> getAll() 
	{
		return userDao.getAllUsers();
	}

}
