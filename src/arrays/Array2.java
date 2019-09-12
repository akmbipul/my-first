package arrays;

public class Array2 {

	public static void main(String[] args) {
	
		int studentId;
		
	Student[] studentArray = getStudentArray(studentId : 100);

	for (int i=0; i<studentArray.length; i++) {
		
		System.out.println("The student id for student "+(i+1)+" is "+studentArray[i].getStudentId());
		
	}
	
	
	
	
}
	
	
	public static Student[] getStudentArray(int studentSize) {
		
		Student[] studentArray = new Student [studentSize];
		
		for (int i=0; i<studentSize; i++) {
			
			Student student = new Student(studentId : i+1);
			
			studentArray[i]= student;
				
		}
		return studentArray;
	  }	
}
