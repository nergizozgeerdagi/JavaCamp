package CommerceBackend.DataAccess.Abstracts;
import java.util.List;
import CommerceBackend.Entities.Concretes.Users;

public interface UserDao 
{
	
	void add(Users user);
	void update (Users user);
	void delete (Users user);
	Users getUsers(String email, String password);
	boolean getEmail(String email);
	List<Users> getAllUsers();
	
}
