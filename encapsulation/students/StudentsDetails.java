/* Create a class Student with private fields: id, name, and marks.
Provide public getter and setter methods. In the main class,
 create a Student object, set values using setters, and display them using getters.*/

package encapsulation.students;

public class StudentsDetails {
	public static void main(String[] args) {
		Students s = new Students();

		s.setStudentId(1001);
		s.setStudentName("Samruddhi");
		s.setStudentMarks(80);

		System.out.println("====== Student Details ======");
		System.out.println("Student Id is: " + s.getStudentId());
		System.out.println("Student Name is: " + s.getStudentName());
		System.out.println("Student Marks is: " + s.getStudentMarks());

	}
}
