package com.mkpits.lambda;

import java.util.function.BooleanSupplier;

//o, O, L, l, . , ( , > 
public class ZeroParameter {
	// three types of lambda expression
	// zero parameter - () -> System.out.println(" ");
	// single parameter - (n) -> System.out.println(n);
	// multiple parameter - (n, x) -> System.out.println(n, x); 
	public static void main(String[] args) {
		
		// Zero parameter lambda expression
        BooleanSupplier bs = () -> true;// BooleanSupplier - This is a functional interface whose functional method is getAsBoolean().
        System.out.println(bs.getAsBoolean()); // it return the boolean value true/false
        
        int H = 45, V = 18;
        bs = () ->  (H < V);
        System.out.println(bs.getAsBoolean());
	}

	

}
