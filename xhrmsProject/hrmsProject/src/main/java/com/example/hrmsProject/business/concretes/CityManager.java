package com.example.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsProject.business.abstracts.CityService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.ErrorResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.CityDao;
import com.example.hrmsProject.entities.concretes.Cities;

@Service
public abstract class CityManager implements CityService
{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) 
	{
		this.cityDao = cityDao;
	}
	
	@Override
	public DataResult<List<Cities>> getAll() 
	{
		return new SuccessDataResult<List<Cities>>(this.cityDao.findAll() , Messages.citiesListed);
	}

	@Override
	public Result add(Cities city) 
	{
		if (this.isDataRightChecker(city).isSuccess()) 
		{
			this.cityDao.save(city);
		return new SuccessResult(Messages.cityAdded);
		}
		return isDataRightChecker(city);
		
	}
	
	private Result isDataRightChecker(Cities city) 
	{
		if ( city.getCity_name().isEmpty() || city.getCity_name().equals(null))
		{
			return new ErrorResult("HATA , şehir ismi boş bırakılamaz!");
		}
		
		return new SuccessResult();
	}
}