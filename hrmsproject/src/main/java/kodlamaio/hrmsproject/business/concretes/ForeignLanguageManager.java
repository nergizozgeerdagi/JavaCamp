package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.ForeignLanguageService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.ForeignLanguageDao;
import kodlamaio.hrmsproject.entities.concretes.ForeignLanguage;
import kodlamaio.hrmsproject.entities.dtos.ForeignLanguageDetailsDto;

@Service
public class ForeignLanguageManager implements ForeignLanguageService 
{

	private ForeignLanguageDao foreignLanguageDao;
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) 
	{
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}


	@Override
	public DataResult<List<ForeignLanguageDetailsDto>> findByResume_Id(int id) 
	{
		return new SuccessDataResult<List<ForeignLanguageDetailsDto>>(foreignLanguageDao.findByResume_ResumeId(id));
	}

	@Override
	public DataResult<ForeignLanguage> findById(int id) 
	{
		return new SuccessDataResult<ForeignLanguage>( foreignLanguageDao.getOne( id ));
	}

}