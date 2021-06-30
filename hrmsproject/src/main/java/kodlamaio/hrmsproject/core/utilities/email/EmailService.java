package kodlamaio.hrmsproject.core.utilities.email;

import kodlamaio.hrmsproject.core.utilities.results.Result;

public interface EmailService 
{
	Result send(String to, String title, String message);
}