package com.example.hrmsProject.business.abstracts;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.CandidateImage;

public interface CandidateImageService 
{
	Result add(CandidateImage candidateImage , MultipartFile file);
	DataResult<List<CandidateImage>> getAll();
}
