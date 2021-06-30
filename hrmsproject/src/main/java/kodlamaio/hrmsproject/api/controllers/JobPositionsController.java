package kodlamaio.hrmsproject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.business.abstracts.JobPositionService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController 
{

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) 
	{
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll()
	{
		return this.jobPositionService.getAll();
	}
	
	@GetMapping("/getbyname")
	public DataResult<JobPosition> getByPositionName(String positionName)
	{
		return this.jobPositionService.getByPositionName(positionName);
	}
	
	@GetMapping("/getbyid")
	public DataResult<JobPosition> getById(int id)
	{
		return this.jobPositionService.getById(id);
	}
	
	@PostMapping("add")
	public Result addNew(@RequestBody JobPosition jobPosition) 
	{
		return this.jobPositionService.addNew(jobPosition);
	}
	
}