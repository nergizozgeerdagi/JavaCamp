package homework1;
public class CourseManager 
{
	public void AddToCart(Course courses) 
	{
		System.out.println(courses.courseName +" Kursa Kay�t Ol");
	}
	public void courseStart(Course courses) 
	{
			System.out.println(courses.courseName + courses.percent + " % TAMAMLANDI");
	}
}
