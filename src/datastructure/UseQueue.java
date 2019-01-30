package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Galileo");  //head, first
		queue.add("Henry");
		queue.add("Itaca");
		queue.add("John");
		queue.add("Kent");  //tail, last



		// peek from the queue
		System.out.println(queue.peek());
		//remove from the queue
		System.out.println(queue.remove());

		System.out.println(queue.peek());
		// poll from the queue
		System.out.println(queue.poll());

		System.out.println(queue.peek());

		System.out.println("\nPrinting queue using for each loop: ");
		for(String st : queue) {
			System.out.print(st + " ");
		}
		queue.add("Lehman");

		queue.poll();

		System.out.println("\n\nPrinting queue After adding and removing one element using Iterator ");
		Iterator it = queue.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}

}
