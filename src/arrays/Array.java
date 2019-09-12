package arrays;

public class Array {

	
	public static void main(String[] args) {
	
		//1st way initialize
		int studentId1 ;
		int studentId2 ;
		int studentId3 ;
		int studentId4 ;
		int studentId5 ;
		
	    int[] studentArray2 = {101,101,102,103,104};//another way of initializing the array
			
		//2d way initialize
	    int student1Id = 100;
		int student2Id = 101;
		int student3Id = 102;
		int student4Id = 103;
		int student5Id = 104;
		int student6Id;
		    student6Id = 105;
	    
	    int[] studentArray = new int[5];// define the array length by creating an Object
		
		studentArray[0]= student1Id;
		studentArray[1]= student2Id;
		studentArray[2]= student3Id;
		studentArray[3]= student4Id;
		studentArray[studentArray.length-1]= student5Id;// calling last array straight way
		
		
		//output
		System.out.println(studentArray.length);
		System.out.println(studentArray[0]);
		System.out.println(studentArray[1]);
		
		for (int i=0;1<5;i++) {
			System.out.println(studentArray2[i]);
		}
		
		
		
		
		
		
		
		
	}
}
