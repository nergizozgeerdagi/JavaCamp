package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.Employee;
import kodlamaio.hrmsproject.entities.dtos.EmployeeForRegisterDto;

public interface EmployeeService 
{
    DataResult<List<Employee>> getAll();
    Result register(EmployeeForRegisterDto employee);
    DataResult<Employee> getById(int id);
}