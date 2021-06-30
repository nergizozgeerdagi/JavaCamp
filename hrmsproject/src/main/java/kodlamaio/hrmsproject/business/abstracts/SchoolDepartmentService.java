package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.dtos.SchoolDepartmentDetailsDto;
import kodlamaio.hrmsproject.entities.dtos.SchoolDepartmentForAddDto;

public interface SchoolDepartmentService 
{
	DataResult<List<SchoolDepartmentDetailsDto>> findByEmployeeSchoolDepartments_Employee_UserId(int id);
	Result assignToEmployee(SchoolDepartmentForAddDto schoolDepartment);
}