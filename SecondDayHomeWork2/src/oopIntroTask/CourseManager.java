package oopIntroTask;

public class CourseManager 
{
	// Kurslar üzerinde yapabileceðimiz fonskiyonlarýn yani metodlarýn tutulan kýsýmdýr
	
		public void enrollCourse(Course course) 
		{
			System.out.println(course.courseName + "'a Baþarýyla Kaydoldunuz!!");
		}
		public void withdrawCourse(Course course)
		{
			System.out.println(course.courseName + "'tan Ayrýldýnýz!!");
		}
		
		public void rollCall(Course course)
		{
			System.out.println("Yoklamanýz Alýnmýþtýr :)");
		}
		
		public void sendComment(Course course, String comment)
		{
			System.out.println("Yorumunuz Baþarýyla Gönderildi: "+comment);
		}
}
