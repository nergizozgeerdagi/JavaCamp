package CommerceBackend.Business.Abstracts;
public interface AuthService 
{
	boolean checkFirstLastName(String firstName,String lastName);
	boolean checkMail(String email);
	boolean checkMailExist(String email);
	boolean checkPassword(String password);
	boolean userIsValid(String name,String lastName,String email,String password);
	void sendConfirmMail();
}