package kodlamaio.hrmsproject.core.utilities;

import kodlamaio.hrmsproject.core.utilities.results.Result;

public interface IdentityValidationService 
{
	   Result validate(String tckn, String firstName, String lastName, int yearOfDate);
}