package com.mkpits.collectionPractice;

import java.util.ArrayList;

public class CompairTwoArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Pranav");
		list1.add("Karan");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Pranav");
		list2.add("Kaustubh");
		
		ArrayList<String> result = new ArrayList<String>();
		for (String Rs : list1) {
			result.add(list2.contains(Rs)? "Yes" : "No");
		}
		System.out.println(result);
	}

}
