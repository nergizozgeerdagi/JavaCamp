package managers;

public class Main 
{

	public static void main(String[] args) 
	{
		 Instructor instructor= new Instructor(50849, 85293);
		
		 UserManager user = new UserManager();
		 
		 Student student= new Student();
		 student.firstName="Nergiz";
		 student.lastName="Erdagi";
		 student.eMail="nergiz.erdagi@gmail.com";
		 student.CourseName="Yazilim Gelistirici Kampi (Java*React)";
		 student.progressRate=46;
		 user.add(student);
		 
		 StudentManager studentmanager=new StudentManager();
		 studentmanager.add(student);
		 studentmanager.prograsRate(student);
		 
		 InstructorManager instructor1= new InstructorManager();
		 
		 Instructor teacher= new Instructor(23009, 92834);
		 teacher.firstName="Engin";
		 teacher.lastName="Demirog";
		 teacher.id=272159087;
		 teacher.eMail="engindemirog@gmail.com";
		 
		 instructor1.add(teacher);
	}

}
