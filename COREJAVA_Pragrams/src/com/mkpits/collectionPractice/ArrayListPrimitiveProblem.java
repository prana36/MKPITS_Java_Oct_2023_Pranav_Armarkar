package com.mkpits.collectionPractice;

import java.util.ArrayList;

public class ArrayListPrimitiveProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>(5);
		array.add(1);
		array.add(3);
		array.add(13);
		array.add(12);
		array.add(13);
		
		for (Integer i : array) {
			System.out.println(i);
		}
		
		array.add(17);
		array.add(14);

		System.out.println(array);
	}

}
