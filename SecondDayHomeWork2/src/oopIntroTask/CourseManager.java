package oopIntroTask;

public class CourseManager 
{
	// Kurslar �zerinde yapabilece�imiz fonskiyonlar�n yani metodlar�n tutulan k�s�md�r
	
		public void enrollCourse(Course course) 
		{
			System.out.println(course.courseName + "'a Ba�ar�yla Kaydoldunuz!!");
		}
		public void withdrawCourse(Course course)
		{
			System.out.println(course.courseName + "'tan Ayr�ld�n�z!!");
		}
		
		public void rollCall(Course course)
		{
			System.out.println("Yoklaman�z Al�nm��t�r :)");
		}
		
		public void sendComment(Course course, String comment)
		{
			System.out.println("Yorumunuz Ba�ar�yla G�nderildi: "+comment);
		}
}
