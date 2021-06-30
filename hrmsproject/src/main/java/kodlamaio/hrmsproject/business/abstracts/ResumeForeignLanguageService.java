package kodlamaio.hrmsproject.business.abstracts;

import java.util.List;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.dtos.ForeignLanguageForAddDto;

public interface ResumeForeignLanguageService 
{
    Result addRange(List<ForeignLanguageForAddDto> foreignLanguages , Resume resume);
}