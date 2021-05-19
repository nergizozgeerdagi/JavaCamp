package managers;

public class Student extends User
{
	int progressRate;
	String CourseName;
	
	public Student() 
	{
		
	}

	public int getProgressRate() 
	{
		return progressRate;
	}

	public void setProgressRate(int progressRate) 
	{
		this.progressRate = progressRate;
	}

	public String getCourseName() 
	{
		return CourseName;
	}

	public void setCourseName(String courseName) 
	{
		CourseName = courseName;
	}

	public Student(int progressRate, String courseName) 
	{
		super();
		this.progressRate = progressRate;
		CourseName = courseName;
	}
}
