package com.mkpits.collectionPractice;

import java.util.ArrayList;

public class ReplacedElementInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> id = new ArrayList<Integer>();
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		
		for (Integer integer : id) {
			System.out.println(integer);
		}
		System.out.println("After replace Second Element");
	    
		id.set(1, 90);
		
		System.out.println(id);
	}

}
