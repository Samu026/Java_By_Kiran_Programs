/* Student and Marks: Create a class Student with fields name, rollNo. 
 * Inherit a class Marks with fields subject1, subject2, and method to 
 * calculate total. Display all details using a Marks class object.
 */

package inheritance.studentresult;

public class StudentDetails {
	public static void main(String[] args) {
		Marks m = new Marks();
		m.studentBasicData("Samruddhi", 02);
		m.calculateMarks(76, 90);
		m.calculateAverage();
	}
}
