package com.mkpits.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example2_Queue {

	public static void main(String[] args) {
      Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(13);
		queue.offer(21);
		queue.offer(23);
		queue.offer(25);
		queue.offer(26);
		queue.offer(22); // Offer Method Is also use to Add Elements in Queue
		queue.offer(21);
		queue.offer(21);
		queue.offer(21);
		queue.offer(24);
		System.out.println("Elements of Queue is "+queue);

	}

}
