package kodlamaio.hrmsproject.entities.dtos;

import java.util.Date;
import javax.validation.constraints.NotNull;
import kodlamaio.hrmsproject.entities.concretes.Employee;
import kodlamaio.hrmsproject.entities.concretes.SchoolDepartment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SchoolDepartmentForAddDto 
{

	@NotNull
	private SchoolDepartment schoolDepartment;
	@NotNull
	private Employee employee;
	@NotNull
	private Date startDate;
	private Date endDate;
	
}