package com.mkpits.lambda;

public class NoParameter {
 
	static void run(NoParameterInterface np) {
		np.print();
	}
	public static void main(String[] args) {

		run(() -> System.out.println("MKPITS"));
		
	}

	
}
