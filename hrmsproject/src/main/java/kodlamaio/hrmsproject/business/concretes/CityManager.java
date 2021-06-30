package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.CityService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.CityDao;
import kodlamaio.hrmsproject.entities.concretes.City;

@Service
public class CityManager implements CityService
{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) 
	{
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() 
	{
		
		return new SuccessDataResult<List<City>>(cityDao.findAll());
	}

	@Override
	public DataResult<City> getById(int id)
	{
		City city = cityDao.findById(id);
		if(city==null) return new ErrorDataResult<City>();
		return new SuccessDataResult<City>(city);
	}

}