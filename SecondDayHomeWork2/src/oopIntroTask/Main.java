package oopIntroTask;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// COURSES
				Course course1 = new Course
						(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", 
						"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
						"�cretsiz","C#");
				
				Course course2 = new Course
						(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", 
						"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
						"�cretsiz","Java");
				
				Course course3 = new Course
						(3, "Programlamaya Giri� ��in Temel Kurs", 
						"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
						"�cretsiz","Python, Java, C#");
				
				// COURSE LIST
				Course[] courses = {course1, course2, course3};
				
				// COURSE LOOP
				for(int i=0; i<courses.length;i++){
					System.out.println(i+1 + ". Kursumuzun Ad�: "+courses[i].courseName);
				}
				
				// COURSE MANAGER
				CourseManager courseManager = new CourseManager();
				courseManager.enrollCourse(course1);
				courseManager.withdrawCourse(course3);
				courseManager.sendComment(course2, "Kamp �ok g�zel gidiyor. �ok te�ekk�rler, eme�inize sa�l�k. :)");
				courseManager.rollCall(course2);
				
				
				//CATEGORY
				Category category1 = new Category(1, "T�m�");
				Category category2 = new Category(2, "Programlama");
				
				// CATEGORY LIST
				Category[] categories = {category1, category2};

				// CATEGORY LOOP
				for(Category category:categories) 
				{
					System.out.println("Bulunan Kategoriler: "+category.categoryName);
				}
				
				
				// INSTRUCTOR 
				Instructor instructor1 = new Instructor(1, "T�m�");
				Instructor instructor2 = new Instructor(2, "Engin Demiro�");
				Instructor instructor3 = new Instructor(3, "Nergiz Erda��");
				
				// INSTRUCTOR LIST
				Instructor[] instructors = {instructor1, instructor2, instructor3};
				
				// INSTRUCTOR LOOP
				for(Instructor i:instructors) 
				{
					System.out.println("E�itmenlerimiz: "+i.instructorName);
				}
				
	}

}
