package com.mkpits.lambda;

public class SingleParameter {

	static void run(SingleParameterInterface sp, Integer digit) {
		sp.grtDigit(digit);
	}
	public static void main(String[] args) {

		run((s) -> System.out.println(s), 45);
	}

}
