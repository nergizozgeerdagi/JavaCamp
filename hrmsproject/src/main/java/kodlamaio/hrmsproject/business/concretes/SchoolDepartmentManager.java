package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.EmployeeSchoolDepartmentService;
import kodlamaio.hrmsproject.business.abstracts.EmployeeService;
import kodlamaio.hrmsproject.business.abstracts.SchoolDepartmentService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.SchoolDepartmentDao;
import kodlamaio.hrmsproject.entities.concretes.EmployeeSchoolDepartment;
import kodlamaio.hrmsproject.entities.dtos.SchoolDepartmentDetailsDto;
import kodlamaio.hrmsproject.entities.dtos.SchoolDepartmentForAddDto;

@Service
public class SchoolDepartmentManager implements SchoolDepartmentService
{

	private SchoolDepartmentDao schoolDepartmentDao;
	private EmployeeSchoolDepartmentService employeeSchoolDepartmentService;
	private EmployeeService employeeService;
	
	@Autowired
	public SchoolDepartmentManager
			(SchoolDepartmentDao schoolDepartmentDao,
			EmployeeSchoolDepartmentService employeeSchoolDepartmentService,
			EmployeeService employeeService) 
	{
		super();
		this.schoolDepartmentDao = schoolDepartmentDao;
		this.employeeSchoolDepartmentService = employeeSchoolDepartmentService;
		this.employeeService = employeeService;
	}

	@Override
	public DataResult<List<SchoolDepartmentDetailsDto>> findByEmployeeSchoolDepartments_Employee_UserId(int id) 
	{
		return new SuccessDataResult<List<SchoolDepartmentDetailsDto>>(schoolDepartmentDao.findByEmployeeSchoolDepartments_Employee_UserId(id));
	}

	@Override
	public Result assignToEmployee(SchoolDepartmentForAddDto schoolDepartment)
	{
		this.employeeSchoolDepartmentService.add(new EmployeeSchoolDepartment
				(employeeService.getById(schoolDepartment.getEmployee().getUserId()).getData(),
				this.schoolDepartmentDao.getOne(schoolDepartment.getSchoolDepartment().getId()),
				schoolDepartment.getStartDate(),
				schoolDepartment.getEndDate()));
		
		return new SuccessResult();
	}

}