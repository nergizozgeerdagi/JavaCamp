package CommerceBackend.Core.Concretes;
import CommerceBackend.GoogleService.GoogleRegisterManager;
import CommerceBackend.Core.Abstracts.SignUpService;

public class SignUpServiceAdapter implements SignUpService
{

	@Override
	public void SignUpWithAnotherAccount(String email, String password) 
	{
		
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.signUp(email, password);
	}

}