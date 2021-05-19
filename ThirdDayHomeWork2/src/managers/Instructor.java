package managers;

public class Instructor extends User 
{
	int id;
	int numberOfStudents;

	public Instructor(int id, int numberOfStudents) 
	{
		super();
		this.id = id;
		this.numberOfStudents = numberOfStudents;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) 
	{
		this.numberOfStudents = numberOfStudents;
	}
}
