package primeNumber;

public class FindPrimeNumber {

	public static void main(String[] args) {

		for (int i = 2; i <= 100;) {
			
			int prime = 1;
			
			for (int loop = 2; loop <= i; loop++) {
				
				if ((i % loop) == 0 && loop != i) {
					
					prime = 0;
				}
			}
			if (prime != 0) {
	
				System.out.println(i + " is a prime number");
				
				i++;
				
			} else
				i++;
		}

		// Another way to find prime number
		
		int i = 0;
		int num = 0;
		
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			
			int counter = 0;
			
			for (num = i; num >= 1; num--) {
				
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);

	}

}
