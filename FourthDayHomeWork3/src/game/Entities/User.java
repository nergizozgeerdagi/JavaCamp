package game.Entities;

public class User 
{

	private int Id;
	private String FirstName;
	private String LastName;
	private String nationalityId;
	private String dayOfBirth;
	
	public User() 
	{
		
	}

	public User(int id, String firstName, String lastName, String nationalityId, String dayOfBirth)
	{
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.nationalityId = nationalityId;
		this.dayOfBirth = dayOfBirth;
	}

	public int getId() 
	{
		return Id;
	}

	public void setId(int id) 
	{
		Id = id;
	}

	public String getFirstName() 
	{
		return FirstName;
	}

	public void setFirstName(String firstName) 
	{
		FirstName = firstName;
	}

	public String getLastName() 
	{
		return LastName;
	}

	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}

	public String getNationalityId() 
	{
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) 
	{
		this.nationalityId = nationalityId;
	}

	public String getDayOfBirth() 
	{
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) 
	{
		this.dayOfBirth = dayOfBirth;
	}
}

