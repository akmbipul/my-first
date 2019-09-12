package useScanner;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {

	private static int seed;

	public static void main(String[] args) {
		
		
		int[] studentsId = new int[10]; // Define the size of array
		
		Random random = new Random();
		
		//input Loop
		for(int i=0; i<studentsId.length; i++) {
			
			studentsId[i]= random.nextInt(20); //bound:200 is the limit
		}
		
		//Output Loop
		for (int i=0;1<studentsId.length;i++) {
			
			System.out.println(studentsId[i]);
		}	
			
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
