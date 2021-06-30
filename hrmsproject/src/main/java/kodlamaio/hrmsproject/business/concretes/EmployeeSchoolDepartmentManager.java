package kodlamaio.hrmsproject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.EmployeeSchoolDepartmentService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.EmployeeSchoolDepartmentDao;
import kodlamaio.hrmsproject.entities.concretes.EmployeeSchoolDepartment;

@Service
public class EmployeeSchoolDepartmentManager implements EmployeeSchoolDepartmentService
{

	@Autowired
	private EmployeeSchoolDepartmentDao employeeSchoolDepartmentDao;
	
	@Override
	public Result add(EmployeeSchoolDepartment employeeSchoolDepartment) 
	{
		this.employeeSchoolDepartmentDao.save(employeeSchoolDepartment);
		return new SuccessResult();
	}

}