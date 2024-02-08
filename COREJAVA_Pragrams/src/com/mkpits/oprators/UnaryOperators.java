package com.mkpits.oprators;

public class UnaryOperators {
	// these nonstatic variable declear in class area so that we can use directly in non static method
	// if we want to use these variable in static area we need to creat object 
	int p=20;
	int o=30;

	public static void main(String[] args) {
		
		
		UnaryOperators uo = new UnaryOperators();
		uo.increment();
		uo.decrement();
		
	}
	private void decrement() 
	{
		System.out.println("=======================================================================");
		System.out.println("Decreament");
		System.out.println(o--);//d-30,m-29
		System.out.println(o--);//d-29,m-28
		System.out.println(--o);//d-27,m-27
		System.out.println(o--);//d-27,m-26
		System.out.println(--o);//d-25,m-25
		
	}
	
	public void increment() {
		
		System.out.println("Increament");
		System.out.println(++p);//d-21 ,m-21
		System.out.println(p++);//d-21 ,m-22
		System.out.println(p++);//d-22 ,m-23
		System.out.println(++p);//d-24 , m-24
		System.out.println(++p);//d-25 , m-25
	}

}
