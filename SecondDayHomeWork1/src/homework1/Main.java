package homework1;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Course course1=new Course
				(101, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demiro�");
		Course course2=new Course
				(102, "Programlamaya Giri� i�in Temel Kurs ", "Engin Demiro�");
		course2.percent=80;
		System.out.println("KURSLAR");
		Course[] courses= {course1,course2};
		for(Course course: courses) 
		{
			System.out.println(course.courseName);
		}
		System.out.println("******************************************");
		CourseManager courseManager=new CourseManager();
		courseManager.AddToCart(course1);
		courseManager.courseStart(course2);
	}
}

