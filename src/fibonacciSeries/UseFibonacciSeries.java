package fibonacciSeries;

public class UseFibonacciSeries {

	public static void main(String[] args) {

		// fibonacci Series - 0,1,1,2,3,5,8,13,21.....100

		int n;
		int a = 0;
		int b = 0;
		int c = 1;

		System.out.print("Fibonacci Series:");

		for (int i = 1; i <= 100; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
	
	
	
		//easiest way to find fibonacci 

				int prev = 0;
				int next = 1;
				
				for (int i=0; i<20; i++) {
					
					System.out.println("Fibonacci Series: " + prev);
					
					prev = prev + next;
					
					next = prev - next;
				}
	
	
	}
	
}
