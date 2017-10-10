package Does;

import java.util.Date;

import org.joda.time.DateTime;

import Registration.Student;
import Registration.Module;
import Registration.CourseProgramme;

public class output {

	public static void main(String[] args) {

	
		Student[] students = new Student[5];
		Student student = new Student("cian",22, new Date(),1);
		Student student1 = new Student("frank",21, new Date(),2);
		Student student2 = new Student("james",23, new Date(),3);
		Student student3 = new Student("freddie",20, new Date(),4);
		Student student4 = new Student("bob",25, new Date(),5);
		CourseProgramme coolCourse = new CourseProgramme("TestCourse", new DateTime().now().minusYears(1), new DateTime().now());
		Module testModule = new Module("Test Module", "CT417");
		
		testModule.setStudent(student);
		testModule.setStudent(student1);
		testModule.setStudent(student2);
		
		coolCourse.setModule(testModule);
		
		System.out.println(coolCourse.toString());
	}
	// students[0] = new Student("cian",22, new Date(),1);
	// students[1] = new Student("frank",21, new Date(),2);
	// students[2] = new Student("james",23, new Date(),3);
	// students[3] = new Student("freddie",20, new Date(),4);
	// students[4] = new Student("bob",25, new Date(),5);

}
