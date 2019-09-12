package javaLoop;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {

		// Have the user enter how many rows they want for this output
		// and print the number triangle as below
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		
		int numofRows;
		
		//Users Input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Number of rows: ");
		numofRows = scan.nextInt();
		
		//Nested Loop 
		for (int i = 0; i <= numofRows; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
