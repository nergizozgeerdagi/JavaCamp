package CommerceBackend.Business.Concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import CommerceBackend.Business.Abstracts.AuthService;

public class AuthManager implements AuthService
{
	
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	
	@Override
	public boolean checkFirstLastName(String firstName, String lastName) {
		if(firstName.length()<2 || lastName.length()<2) {
			System.out.println("Ýsim ve Soyisim en az 2 karakter olmalýdýr!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkMail(String email) 
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) 
		{
			return true;
		}
		else 
		{
			System.out.println("email geçersiz");
			return false;
		}
	}

	@Override
	public boolean checkMailExist(String email) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkPassword(String password) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userIsValid(String name, String lastName, String email, String password) 
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(name.length()<2 || lastName.length()<2 || !matcher.matches() || password.length()<6 || checkMailExist(email)) 
		{
			System.out.println("hata");
			return false;
		}
		else 
		{
			
			return true;
		}
	}

	@Override
	public void sendConfirmMail() 
	{
		System.out.println("aktivasyon maili gönderildi");
		
	}
	
	
	
}