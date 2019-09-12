package arrays;

public class Student {

	// Create a method that takes in N students and
	// then returns the students into an array
	// create a method that will generate N number of students and store them into an array of students, which will be returned

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {

		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
