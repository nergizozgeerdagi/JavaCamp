package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsproject.entities.concretes.City;

public interface CityDao extends JpaRepository<City,Integer>
{
    City findById(int id);
}