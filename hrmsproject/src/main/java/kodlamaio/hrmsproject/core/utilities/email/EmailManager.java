package kodlamaio.hrmsproject.core.utilities.email;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;

@Service
public class EmailManager implements EmailService
{

	@Override
	public Result send(String to, String title, String message) 
	{
		return new SuccessResult("E-posta başarıyla gönderildi.");
	}

}