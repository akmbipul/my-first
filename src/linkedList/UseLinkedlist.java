package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedlist {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>(); //List only allow few code ex.list from util List class
		
		LinkedList<String> list2 = new LinkedList<>(); //list 2 code from Linked List util class
		
		list.add("NY");
		list2.addLast("FL");
		list.add("NJ");
		list2.addFirst("CA");
		list.add(2,"TX");
		
		
		Iterator<String> it = list.iterator();
		 
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//for each loop can do the same as while
		for(String name: list){
			System.out.println(name);			
		}	
		
		//find out the size of the list
		 int size = list.size();
		 int size2 = list2.size();
		 
		System.out.println("size of the list is: "+size);
		
		System.out.println("size of the list is: "+size2);
		
		//all different ways removing data from list
		list.remove("FL");
		list2.removeFirst();
		list2.removeLast();
		list.remove(2);
		
		System.out.println("After removing one node");
		
		Iterator<String> it2 = list.iterator();
		
		while(it2.hasNext()) {
			
			System.out.println(it2.next());
		}
		
		//for each loop can do the same as while
		for(String name: list){
			System.out.println(name);			
		}	
		
		
		
		
	}
}
