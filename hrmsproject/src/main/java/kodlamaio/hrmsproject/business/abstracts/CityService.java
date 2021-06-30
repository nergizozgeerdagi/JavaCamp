package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.entities.concretes.City;

public interface CityService 
{
    DataResult<List<City>> getAll();
    DataResult<City> getById(int id);
}