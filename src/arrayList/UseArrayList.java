package arrayList;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
	
	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("NY");
		list.add("FL");
		list.add("Nj");
		
		//for loop can read the list
		
		for(int i=0; i< list.size(); i++ ) {
			
			System.out.println(list.get(i));
		}
		
		// Using Iterator to read list
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		// Using for each loop to read list
		
		for(String st:list) {
			
			System.out.println(st);
		}
		
		
		
		
		
		
	}
}
