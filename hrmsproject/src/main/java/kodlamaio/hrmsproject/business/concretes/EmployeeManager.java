package kodlamaio.hrmsproject.business.concretes;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.EmployeeService;
import kodlamaio.hrmsproject.business.abstracts.UserService;
import kodlamaio.hrmsproject.core.utilities.IdentityValidationService;
import kodlamaio.hrmsproject.core.utilities.business.BusinessRules;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorDataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrmsproject.entities.concretes.Employee;
import kodlamaio.hrmsproject.entities.concretes.User;
import kodlamaio.hrmsproject.entities.dtos.EmployeeForRegisterDto;

@Service
public class EmployeeManager implements EmployeeService
{

	private EmployeeDao employeeDao;
	private UserService userService;
    private IdentityValidationService identityValidationService;
    
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao,UserService userService,IdentityValidationService identityValidationService) 
	{
		super();
		this.employeeDao = employeeDao;
		this.userService = userService;
		this.identityValidationService = identityValidationService;
	}

	public DataResult<List<Employee>> getAll() 
	{
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}

	public Result register(EmployeeForRegisterDto employee) 
	{	
		Result businessRules = BusinessRules.run(
				isPasswordsMatch(employee.getPassword(), employee.getVerifyPassword()),
				isUserExistWithEmail(employee.getEmail()),
				isUserExistWithNationalityId(employee.getNationalityId())
				);
		
		if(businessRules!=null) return businessRules;
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(employee.getDateOfBirth());
		if(!identityValidationService.validate(employee.getNationalityId(), 
			employee.getFirstName(), 
			employee.getLastName(), 			
			calendar.get(Calendar.YEAR)).isSuccess())
		{
			return new ErrorResult("TC Kimlik Numarası doğrulaması başarısız oldu.");
		}
		
		User userToRegister = new User(employee.getEmail(), employee.getPassword(),false, UUID.randomUUID().toString());
		userService.add(userToRegister);
		
		Employee employeeToRegister = new Employee(userToRegister.getId(), 
				employee.getFirstName(),
				employee.getLastName(), 
				employee.getNationalityId(),
				employee.getDateOfBirth());
		this.employeeDao.save(employeeToRegister);
		return new SuccessResult
				("İş arayan kayıdı başarıyla oluşturuldu. Lütfen e-posta adresinize gönderilen doğrulama linkiyle hesabınızı doğrulayınız!");
	}
	
	
	
	private Result isPasswordsMatch(String password, String passwordVerify) 
	{
		if(!password.equals(passwordVerify))
		{
			return new ErrorResult("Girilen şifre ile şifreniz uyuşmadı!");
		}
		return new SuccessResult();
	}
	
	private Result isUserExistWithEmail(String email) 
	{
		if(userService.getByEmail(email).getData() != null)
			return new ErrorResult("Bu e-posta adresiyle başka bir kullanıcı mevcut!");
		return new SuccessResult();
	}
	
	private Result isUserExistWithNationalityId(String nationalityId) 
	{
		if(employeeDao.findByNationalityId(nationalityId) != null)
			return new ErrorResult("Bu TCKN ile başka bir kullanıcı mevcut!");
		return new SuccessResult();
	}

	public DataResult<Employee> getById(int id) 
	{
		Employee employee = employeeDao.getOne(id);
		if(employee==null) return new ErrorDataResult<Employee>();
		return new SuccessDataResult<Employee>(employee);
	}

}