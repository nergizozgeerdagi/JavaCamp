package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.ForeignLanguageService;
import kodlamaio.hrmsproject.business.abstracts.ResumeForeignLanguageService;
import kodlamaio.hrmsproject.core.utilities.business.BusinessRules;
import kodlamaio.hrmsproject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.ResumeForeignLanguageDao;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.concretes.ResumeForeignLanguage;
import kodlamaio.hrmsproject.entities.dtos.ForeignLanguageForAddDto;

@Service
public class ResumeForeignLanguageManager implements ResumeForeignLanguageService 
{

	private ResumeForeignLanguageDao resumeForeignLanguageDao;
	private ForeignLanguageService foreignLanguageService;
	
	@Autowired
	public ResumeForeignLanguageManager(ResumeForeignLanguageDao resumeForeignLanguageDao, ForeignLanguageService foreignLanguageService) 
	{
		super();
		this.resumeForeignLanguageDao = resumeForeignLanguageDao;
		this.foreignLanguageService=foreignLanguageService;
	}

	@Override
	public Result addRange(List<ForeignLanguageForAddDto> foreignLanguages , Resume resume) 
	{

		for(ForeignLanguageForAddDto foreignLanguage : foreignLanguages) 
		{
			Result businessRulesResult=BusinessRules.run(checkIfLanguageExistsInDatabase(foreignLanguage.getForeignLanguage().getId()));

			if(businessRulesResult != null) 
			{
				return businessRulesResult;
			}
			
			ResumeForeignLanguage resumeForeignLanguage = new ResumeForeignLanguage
					(resume,foreignLanguage.getForeignLanguage(),foreignLanguage.getRatio());

			resumeForeignLanguageDao.save(resumeForeignLanguage);
		}
		
		return new SuccessResult();
	}
	
	private Result checkIfLanguageExistsInDatabase(int id) 
	{
		
		if ( foreignLanguageService.findById(id) == null) 
		{
			return new ErrorResult();
		}
		
		return new SuccessResult();
	}

}