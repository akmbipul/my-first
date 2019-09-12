package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Fahim");
		arrayList.add("Joe");
		arrayList.add("Bob");
		
		System.out.println(arrayList.get(2));
		
		//print Size of the Array
		
		System.out.println("The Size Of The ArrayList is Currently: "+arrayList.size());
		
		//remove "Joe" if you know the location 
		
		arrayList.remove(1);
		
		//remove "Joe" not knowing its location
		
		arrayList.remove(arrayList.indexOf("Joe"));
		
		System.out.println(arrayList.get(1));
		
		
		
	}
}
