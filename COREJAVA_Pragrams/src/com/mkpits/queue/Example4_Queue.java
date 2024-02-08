package com.mkpits.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example4_Queue {

	public static void main(String[] args) 
	{
		 Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(13);
		queue.add(14);
		queue.add(11);
		queue.add(1);
		System.out.println("Elements of Queue is "+queue);
		
		queue.poll();
		//It is used to retrieves and removes the head of this queue,
		//or returns null if this queue is empty.
		System.out.println("Update List is "+queue);
		

	}

}
