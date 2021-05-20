package CommerceBackend;
import CommerceBackend.Business.Concretes.UserManager;
import CommerceBackend.Core.Concretes.SignUpServiceAdapter;
import CommerceBackend.DataAccess.Concretes.HibernateUserDao;
import CommerceBackend.Entities.Concretes.Users;

public class Main 
{

	public static void main(String[] args) 
	{

		Users user1 = new Users(1, "Nergiz", "Erdaðý", "nergiz.erdagi@gmail.com", "12343445");
		Users user2 = new Users(2, "Engin", "Demiroð", "engin@gmail.com", "123456");
		Users user3 = new Users(3,"Admin","Haným","admin@gmail.com","123456789");
			
		UserManager userManager = new UserManager(new HibernateUserDao());
			
		userManager.signUp(user1);
		userManager.signUp(user2);
			
		userManager.login("yeni.uye@gmail.com","2340234567");
			 
		userManager.signUpWithAnotherService("yeni.uye1@gmail.com","12346703",new SignUpServiceAdapter());
	}

}
