package com.mkpits.recursion;



public class RecursionTest1 {

	public static void main(String[] args) {

		RecursionTest1 recursion = new RecursionTest1();
		recursion.callMethod();

	}

	private void callMethod() {

		int counter = 0;
		while (counter < 5) {
			System.out.println("Recursion Call");
			callMethod();
			counter--;
		}

	}

}
