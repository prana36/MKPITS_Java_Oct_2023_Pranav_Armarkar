package com.mkpits.lambda;

import java.util.ArrayList;

public class MultipleParameter {
	// multiple parameter - (n, x) -> System.out.println(n, x); 

	public static void main(String[] args) {

		MulParaInterface add = (int x, int y) -> (x + y);
		System.out.println(add.operation(20, 10));
		MulParaInterface sub = (int x, int y) -> (x - y);
		System.out.println(sub.operation(50, 15));
		MulParaInterface mul = (int x, int y) -> (x * y);
		System.out.println(mul.operation(12, 5));
		
		

	}

}
