package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.entities.concretes.ForeignLanguage;
import kodlamaio.hrmsproject.entities.dtos.ForeignLanguageDetailsDto;

public interface ForeignLanguageService 
{
    DataResult<List<ForeignLanguageDetailsDto> > findByResume_Id(int id);
    DataResult<ForeignLanguage> findById(int id);
}