package arrays;

import java.util.Scanner;


public class Array3 {

	public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
		
		int[] studentsId = new int[5]; // Define the size of array
		
		System.out.println("Please Enter The Number: ");

		//input Loop
		for(int i=0; i<studentsId.length; i++) {
			
			studentsId[i]= sc.nextInt();
					
		}
		
		//Output Loop
		for (int i=0;1<studentsId.length;i++) {
			
			System.out.println(studentsId[i]);
		}	
		
		
	}	
	
}
