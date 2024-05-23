package com.mkpits.collectionPractice;

import java.util.ArrayList;

public class JointwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list1 = new ArrayList<Double>();
		list1.add(23.4);
		list1.add(24.4);
		list1.add(27.4);
		
		for (Double double1 : list1) {
			System.out.println("First List1 is"+double1);
		}
		
		
		ArrayList<Double> list2 = new ArrayList<Double>();

		list2.add(73.4);
		list2.add(83.4);
		list2.add(53.4);

		for (Double double2 : list2) {
			System.out.println("First List1 is"+double2);
		}
		list1.addAll(list2);
		
		System.out.println(list1);
	}

}
