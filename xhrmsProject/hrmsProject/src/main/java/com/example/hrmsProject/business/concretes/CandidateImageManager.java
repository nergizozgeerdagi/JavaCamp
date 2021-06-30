package com.example.hrmsProject.business.concretes;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.hrmsProject.business.abstracts.CandidateImageService;
import com.example.hrmsProject.business.constants.Messages;
import com.example.hrmsProject.core.utilities.helpers.ImageUploadService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.CandidateImageDao;
import com.example.hrmsProject.entities.concretes.CandidateImage;

@Service
public class CandidateImageManager implements CandidateImageService
{

	private CandidateImageDao candidateImageDao;
	private ImageUploadService imageUploadService;
	
	@Autowired
	public CandidateImageManager(CandidateImageDao candidateImageDao ,
			ImageUploadService imageUploadService) 
	{
		super();
		this.candidateImageDao = candidateImageDao;
		this.imageUploadService = imageUploadService;
	}

	@Override
	public Result add(CandidateImage candidateImage , MultipartFile file) 
	{
		
		@SuppressWarnings("unchecked")
		Map<String , String> result = (Map<String , String>) this.imageUploadService.save(file).getData();
		String photoUrl = result.get("url");
		
		candidateImage.setImageUrl(photoUrl);
		
		this.candidateImageDao.save(candidateImage);
		return new SuccessResult(Messages.imageAdded);
		
	}

	@Override
	public DataResult<List<CandidateImage>> getAll() 
	{
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.findAll() , Messages.imagesListed);
	}

}