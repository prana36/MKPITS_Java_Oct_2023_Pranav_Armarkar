package com.mkpits.genericsandcollection;

import java.util.ArrayList;

public class EliminatesTypeCasting {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[10];
		intArr[0] = 10;
		int v = intArr[0];

		System.out.println(intArr.length);

		// In Non Generic version wehave to typecast
		ArrayList list = new ArrayList();
		list.add(10);
		int v1 = (Integer) list.get(0);// returns object and object cant assign to primitive datatype directly

		list.add("mkpits");
		String str = (String) list.get(1);

		// Generic version no need to typecast
		ArrayList<Double> doubleArr = new ArrayList<Double>();
		doubleArr.add(23.78);
		double d = doubleArr.get(0);

	}

}
