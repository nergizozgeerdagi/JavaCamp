package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlamaio.hrmsproject.entities.concretes.SchoolDepartment;
import kodlamaio.hrmsproject.entities.dtos.SchoolDepartmentDetailsDto;

public interface SchoolDepartmentDao extends JpaRepository<SchoolDepartment, Integer>
{

	@Query("Select new kodlamaio.hrmsproject.entities.dtos.SchoolDepartmentDetailsDto"
			+ "(sd.department,es.startDate,es.graduateDate,sd.school.name) From SchoolDepartment sd JOIN sd.employeeSchoolDepartments es "
			+ "Where es.employee.userId=:userId Order By es.graduateDate DESC")
	List<SchoolDepartmentDetailsDto> findByEmployeeSchoolDepartments_Employee_UserId(int userId);
	
}