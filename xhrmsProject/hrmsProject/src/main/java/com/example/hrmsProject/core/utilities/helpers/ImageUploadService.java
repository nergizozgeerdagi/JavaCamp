package com.example.hrmsProject.core.utilities.helpers;

import org.springframework.web.multipart.MultipartFile;

import com.example.hrmsProject.core.utilities.results.DataResult;

public interface ImageUploadService 
{

	DataResult<?> save(MultipartFile image);
}