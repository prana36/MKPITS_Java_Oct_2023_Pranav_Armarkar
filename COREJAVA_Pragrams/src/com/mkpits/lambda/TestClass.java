package com.mkpits.lambda;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> at = new ArrayList<Integer>();
		at.add(1);
		at.add(2);
		at.add(3);
		at.add(4);
		at.add(5);
		at.add(6);
		at.add(8);
		
		at.forEach(n -> System.out.println(n));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 at.forEach(n -> {
	            if (n % 2 == 0)
	                System.out.println(n);
	        });
		
		
				

	}

}
