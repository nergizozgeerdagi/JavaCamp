package managers;

public class StudentManager extends UserManager
{
	public void add(Student student) {
		System.out.println(student.CourseName+"adli kursa sahipsiniz.");
	}
	
	public void prograsRate(Student student) 
	{
		System.out.println("Kurstaki Ilerleme Oraniniz(%) :"+student.progressRate);
	}
}
