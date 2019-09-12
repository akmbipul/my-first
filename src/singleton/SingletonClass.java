package singleton;

public class SingletonClass {

	//Singleton Class is all about to create one object/instance of the class, to do that...
	//have to create static instance, access modifier could be public or private
	//declare private constructor 
	//and have to have a static Method 
	// so we only use singleton class when we have to create one object of a class irrespective how many times we try to initialize the object
    // so it will have same implementation of the class
	// it can also have some regular methods.
	
	public static String password = "secret Code";
	
	public static SingletonClass singletonClass = new SingletonClass();
	
	//public static SingletonClass singletonClass = null;  //if it is null, then if will execute in getInstance method
	
	
	
	private SingletonClass(){} //Private Constructor
	
	
	
	public static SingletonClass getInstance() {
		
//		if (singletonClass ==null) {
//			singletonClass = new SingletonClass();
//		}
		
		return singletonClass;
	}
	
	
}
