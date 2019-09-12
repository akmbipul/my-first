package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class arrayListUsingRandom {

	public static void main(String[] args) {

		// Create an Array List that contain 100 random String
		// 1. Create an array list
		// 2. store data into that array list
		// 3. ***bonus*** print the array list

		try {
			ArrayList<Integer> arrayList = new ArrayList<>();

			Random random = new Random();

			// this for loop is assigning random integer value to the array list

			for (int i = 0; i < 100; i++) {

				arrayList.add(random.nextInt());
			}

			// Printing out all the random number from the array list

			for (int i = 0; i < 100; i++) {

				System.out.println(arrayList.get(i));
			}
		
		    // for Each loop also can print out all the random number from array list
			
			for (Integer num : arrayList) {
				
				System.out.println(num);
			}
			
			 // WE can also use Iterator to print out all the random number from array list
			
			Iterator iterator = arrayList.iterator();
			
			while(iterator.hasNext()) {
				
				System.out.println(iterator.next());
			}
			
		    } catch (Exception e) {
			
		    	e.printStackTrace();
		    }

	}
}
