package ders3odev2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		Instructor instructor1 = new Instructor();
	    Instructor instructor2 = new Instructor();
	    
	    student1.setName("Buket");
	    student2.setName("Simay");
	    instructor1.setName("Engin");
	    instructor2.setName("Alihan");
	    
	    User[] users = {student1, student2, instructor1, instructor2};
	    
	    UserManager userManager = new UserManager();
	    userManager.add(users);
	    
	    StudentManager studentManager = new StudentManager();
	    studentManager.selectCourse(student1);
	    
	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.givenCourse(instructor2);
		
		
		

	}

}
