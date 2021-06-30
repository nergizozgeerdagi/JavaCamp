package com.example.hrmsProject.core.utilities.helpers.cloudinary;

import java.io.IOException;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.hrmsProject.core.utilities.helpers.ImageUploadService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.ErrorDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryImageManager implements ImageUploadService
{
    private Cloudinary cloudinary;
    
   

	@SuppressWarnings("rawtypes")
	@Override
	public DataResult<?> save(MultipartFile image)
	{
		try 
		{
			Map uploadResult = cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(uploadResult);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return new ErrorDataResult<Map>();
	}

}