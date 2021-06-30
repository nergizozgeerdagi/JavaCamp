package kodlamaio.hrmsproject.business.abstracts;

import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.EmployeeSchoolDepartment;

public interface EmployeeSchoolDepartmentService 
{
    Result add(EmployeeSchoolDepartment employeeSchoolDepartment);
}