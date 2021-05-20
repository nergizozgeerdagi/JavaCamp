package CommerceBackend.Business.Abstracts;
import java.util.List;
import CommerceBackend.Core.Abstracts.SignUpService;
import CommerceBackend.Entities.Concretes.Users;

public interface UserService 
{
	void signUp(Users user);
	void signUpWithAnotherService(String email,String password,SignUpService signUpService);
	void login(String email,String password);
	List<Users> getAll();
}