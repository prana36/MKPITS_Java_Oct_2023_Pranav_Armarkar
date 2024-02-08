package com.mkpits.lambda;

public interface TestInterface {

	// abstract method
	 abstract void getParameter(int x);
	 
	  // non abstract method / default method
	 default  void print() {
		 System.out.println("Lambda expression.");
	 }
	
}
