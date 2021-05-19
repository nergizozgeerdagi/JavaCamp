package homework1;
public class CourseManager 
{
	public void AddToCart(Course courses) 
	{
		System.out.println(courses.courseName +" Kursa Kayýt Ol");
	}
	public void courseStart(Course courses) 
	{
			System.out.println(courses.courseName + courses.percent + " % TAMAMLANDI");
	}
}
