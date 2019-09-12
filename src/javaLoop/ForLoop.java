package javaLoop;

public class ForLoop {

	public static void main(String[] args) {

		// print "Hello World" 10 times using for loop

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello World");
		}

		
		
		// print all number from 1-100 and display whether they are even or odd using a for loop

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {

				System.out.println(i + " is an even number");
			} else {

				System.out.println(i + " is an odd number");
			}

		}

		
		
	}

}
