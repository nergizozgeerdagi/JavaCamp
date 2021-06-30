package kodlamaio.hrmsproject.api.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrmsproject.business.abstracts.EmployeeService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.entities.concretes.Employee;
import kodlamaio.hrmsproject.entities.dtos.EmployeeForRegisterDto;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController 
{

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) 
	{
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll()
	{
		return employeeService.getAll();
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> add(@Valid @RequestBody EmployeeForRegisterDto employee) 
	{
		return ResponseEntity.ok( this.employeeService.register(employee) );
	}
	
}