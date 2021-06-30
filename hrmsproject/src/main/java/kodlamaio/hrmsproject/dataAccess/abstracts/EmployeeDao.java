package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsproject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>
{
    Employee findByNationalityId(String nationalityId);
}