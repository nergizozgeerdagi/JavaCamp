package com.example.hrmsProject.core.utilities.helpers.cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.ErrorDataResult;
import com.example.hrmsProject.core.utilities.results.SuccessDataResult;

public class ImageUploadHelper {
	

	public DataResult<Map<String, String>> uploadImage(MultipartFile image) {
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "dpsu9nta0", "api_key",
				"55428645302", "api_secret", "wrs5658g5F-kZok8cpmL45nH-oDgE"));
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> uploadResult = cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map<String, String>>(uploadResult);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ErrorDataResult<Map<String, String>>();
	}
}
