package kodlamaio.hrmsproject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.business.abstracts.EmployeeService;
import kodlamaio.hrmsproject.business.abstracts.ForeignLanguageService;
import kodlamaio.hrmsproject.business.abstracts.JobExperienceService;
import kodlamaio.hrmsproject.business.abstracts.ResumeForeignLanguageService;
import kodlamaio.hrmsproject.business.abstracts.ResumeService;
import kodlamaio.hrmsproject.business.abstracts.ResumeSkillService;
import kodlamaio.hrmsproject.business.abstracts.SchoolDepartmentService;
import kodlamaio.hrmsproject.business.abstracts.SkillService;
import kodlamaio.hrmsproject.core.utilities.business.BusinessRules;
import kodlamaio.hrmsproject.core.utilities.files.FileService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorDataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrmsproject.entities.concretes.Employee;
import kodlamaio.hrmsproject.entities.concretes.Resume;
import kodlamaio.hrmsproject.entities.dtos.ResumeForAddDto;
import kodlamaio.hrmsproject.entities.dtos.ResumeWithDetailsDto;

@Service
public class ResumeManager implements ResumeService
{

	private ResumeDao resumeDao;
	private SchoolDepartmentService schoolDepartmentService;
	private JobExperienceService jobExperienceService;
	private ForeignLanguageService foreignLanguageService;
	private SkillService skillService;
	private ResumeForeignLanguageService resumeForeignLanguageService;
	private EmployeeService employeeService;
	private ResumeSkillService resumeSkillService;
	private FileService fileService;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao, 
			SchoolDepartmentService schoolDepartmentService,
			JobExperienceService jobExperienceService,
			ForeignLanguageService foreignLanguageService,
			ResumeForeignLanguageService resumeForeignLanguageService,
			SkillService skillService,
			ResumeSkillService resumeSkillService,
			EmployeeService employeeService,
			FileService fileService) 
	{
		super();
		this.resumeDao = resumeDao;
		this.schoolDepartmentService = schoolDepartmentService;
		this.jobExperienceService = jobExperienceService;
		this.foreignLanguageService = foreignLanguageService;
		this.skillService = skillService;
		this.resumeForeignLanguageService=resumeForeignLanguageService;
		this.employeeService = employeeService;
		this.resumeSkillService = resumeSkillService;
		this.fileService = fileService;
	}


	@Override
	public DataResult<ResumeWithDetailsDto> getResumeWithDetails(int id) 
	{
		ResumeWithDetailsDto resume = resumeDao.getResumeWithDetailsById(id);
		
		if(resume==null) return new ErrorDataResult<ResumeWithDetailsDto>();
		
		resume.setSchoolDepartments(schoolDepartmentService.findByEmployeeSchoolDepartments_Employee_UserId
				(resume.getEmployee().getUserId()).getData());
		
		resume.setJobExperiences(jobExperienceService.findByResume_Id(resume.getId()).getData());
		
		resume.setForeignLanguages(foreignLanguageService.findByResume_Id(id).getData());
		
		resume.setSkills(skillService.findByResume_Id(resume.getId()).getData());
		
		return new SuccessDataResult<ResumeWithDetailsDto>(resume);
	}


	@Override
	public DataResult<List<Resume>> getAll() 
	{
		return new SuccessDataResult<List<Resume>>(resumeDao.findAll());
	}


	@Override
	public Result add(ResumeForAddDto resume) 
	{
		
		Result businessRulesResult = BusinessRules.run();
		if(businessRulesResult != null) return businessRulesResult;
		
		Employee employee = employeeService.getById(resume.getEmployeeId()).getData();
		
		Resume resumeToAdd = new Resume
				(resume.getGithubAdress(),
				resume.getLinkedinAdress(),
				resume.getCoverLetter(),
				this.fileService.upload(resume.getPicture()),
				employee);
        resumeDao.save(resumeToAdd);
		
		this.resumeForeignLanguageService.addRange(resume.getForeignLanguages(), resumeToAdd);
        this.jobExperienceService.addRange(resume.getJobExperiences(), resumeToAdd);
        this.resumeSkillService.addRange(resume.getSkills(), resumeToAdd);

		return new SuccessResult("CV başarıyla kaydedildi.");
		
	}

}