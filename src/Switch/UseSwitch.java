package Switch;

public class UseSwitch {
	public static void main(String[] args) {
		
		int a = 6;

		switch (a) {
		  case 4:
		    System.out.println( "Too small" );
		  case 5:
			  System.out.println( "Exactly!" );
		  case 6:
			  System.out.println( "Too big" );
		  default:
			  System.out.println( "I don't know such values" );
		}
		
	}

	

}
