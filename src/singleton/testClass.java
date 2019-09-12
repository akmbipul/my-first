package singleton;

public class testClass {

	public static void main(String[] args) {
		
		// we can call previous class variables & methods without creating new object
		
		SingletonClass singleton = SingletonClass.getInstance();
		
		System.out.println(singleton.password);
		
		
	}
	
	
}
