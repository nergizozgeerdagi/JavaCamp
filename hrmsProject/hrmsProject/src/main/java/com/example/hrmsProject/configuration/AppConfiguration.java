package com.example.hrmsProject.configuration;

import java.io.IOException;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.ErrorDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;



@Configuration
public class AppConfiguration 
{

	@Bean
	public DataResult<Map<String, String>> uploadImage(MultipartFile image) {
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "dpsu9nta0", "api_key",
				"455151316552541", "api_secret", "wrspcKws-kZok8cpmL45nH-oDgE"));
		try {
			Map<String, String> uploadResult = cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map<String, String>>(uploadResult);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ErrorDataResult<Map<String, String>>();
	}

}