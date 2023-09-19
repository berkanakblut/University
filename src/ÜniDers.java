
public class ÜniDers {

	public static void main(String[] args) {
		
		Department department1 = new Department();
		department1.name = "Philophy";
		
		proffesor proffesor1 = new proffesor();
		proffesor proffesor2 = new proffesor();
		proffesor1.name = "Ali Veli";
		proffesor2.name = "Ayşe Fatma";
		
		Course course1 = new Course();
		Course course2 = new Course();
		course1.name = "Ethics";
		course2.name = "Ontology";
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		student1.name = "Zeynep Gul";
		student2.name = "Metin Saglam";
		student3.name = "Murat Atılgan";
		
		department1.head = proffesor1;
		proffesor1.department = department1;
		
		course1.department = department1;
		department1.courses = new Course[100];
		department1.courses[0] = course1;
		department1.courses[1] = course2;
		
		course1.teacher = proffesor1;
		course2.teacher = proffesor2;
		proffesor1.coursesGiven = new Course[5];
		proffesor1.coursesGiven[0] = course1;
		proffesor2.coursesGiven1 = new Course[5];
		proffesor2.coursesGiven1[0] = course2;
		
		// proffesor2.coursesGiven[1] = course1;
		// proffesor2.coursesGiven[1] = course2;
		
		proffesor1.advisee = new Student[10];
		proffesor1.advisee[0] = student1;
		proffesor1.advisee[1] = student2;
		proffesor2.advisee = new Student[10];
		proffesor2.advisee[0] = student3;
		student1.advisor = proffesor1;
		student2.advisor = proffesor1;
		student3.advisor = proffesor2;
		
		student1.courseTaken = new Course[7];
		student1.courseTaken[0] = course1;
		
		student3.courseTaken = new Course[10];
		student3.courseTaken[0] = course2;
		
		course1.students = new Student[50];
		course1.students[0] = student1;
		course1.students[1] = student2;
		course2.students = new Student[20];
		course2.students[0] = student3;
		
		System.out.println("Name of student student1's first course is " + student1.courseTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + student1.courseTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.courseTaken[0].teacher.department.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
