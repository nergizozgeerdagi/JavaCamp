package com.example.hrmsProject.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrmsProject.business.abstracts.DepartmentService;
import com.example.hrmsProject.core.utilities.results.DataResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments/")
@CrossOrigin
public class DepartmentsController 
{

	private DepartmentService departmentService;

	@Autowired
	public DepartmentsController(DepartmentService departmentService) 
	{
		super();
		this.departmentService = departmentService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Department>> getAll()
	{
		return this.departmentService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Department department)
	{
		return this.departmentService.add(department);
	}
}