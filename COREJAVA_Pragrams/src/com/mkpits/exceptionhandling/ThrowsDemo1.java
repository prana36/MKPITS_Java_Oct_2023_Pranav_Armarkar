package com.mkpits.exceptionhandling;



public class ThrowsDemo1 
{
	public static void main(String[] args) {
	ThrowsDemo1 demo = new ThrowsDemo1();
	demo.square(-1);
	demo.square(10);
	
	}

private void square(int n) {

	try {
		if (n < 0) {
			throw new UserException();
		} else {
			int r = n * n;
			System.out.println("Square of " + n + " = " + r);
		}
	} catch (Exception e) {
		System.out.println(e);
	}

}

}
