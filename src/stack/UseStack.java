package stack;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		
		//Stack theory is LIFO = last in first out
		
		Stack<String> stack = new Stack();
		
		//keep pushing element to the stack
		for (int i=1; i<5;i++) {
			
			stack.push("plate"+i);
		}
		
		// Pushing helps to add an element in the stack
		stack.push("plale1");
		stack.push("plale2");
		stack.push("plale3");
		
		//peek help to find the top element of the stack
		System.out.println(stack.peek());
		
		// Pop helps to search an element from stack 
		System.out.println(stack.pop());
		
		//iterator to pop as a loop
		Iterator it = stack.listIterator();
		
		while(it.hasNext()) {
			
			System.out.println(stack.pop());
		}
		
		
		
	}
}
