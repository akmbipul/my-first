package queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		
		//Queue theory is FIFO = first in first out or last in last out when you do poll.
		
		Queue<String> queue = new LinkedList<>();

		queue.add("Aroz");
		queue.add("Rifat");
		queue.add("Farzana");
		
		System.out.println(queue.peek());
		
		// poll helps to remove the last element because queue theory is last in last out.
		System.out.println(queue.poll());
		
		
		
		
	}
	
	
}
