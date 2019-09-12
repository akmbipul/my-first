package hashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// putting student next to Integer we can access student constructor argument from Student class
		
		HashMap<Integer,Student> studentMap = new HashMap<>();
		
		Student student5 = new Student("Joe", "Bucks", 130000, 6);
		
		// new key word help to initialize the student constructor in this class
		studentMap.put(1, new Student("Kajol", "Kabir", 120000, 5));
		studentMap.put(2, new Student("John", "Deo", 140000, 7));
		studentMap.put(3, new Student("Anne", "Smith", 200000, 9));
		studentMap.put(4, new Student("Fahim", "Haque", 750000, 1));
		studentMap.put(5, student5);
		
		
		//we can call by key(2) as well as individual data(as value)
		
		System.out.println(studentMap.get(2).getLastName());
		System.out.println(studentMap.get(1).getSalary());
		
        // just to see if any key is exist 	
		System.out.println(studentMap.containsKey(5));
		
		
	
		
		
		
		
		
		
		
	}
	
}
