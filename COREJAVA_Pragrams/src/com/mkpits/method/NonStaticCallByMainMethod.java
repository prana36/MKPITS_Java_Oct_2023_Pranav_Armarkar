package com.mkpits.method;

public class NonStaticCallByMainMethod {

	public static void main(String[] args) 
	{
		NonStaticMethodWithReturnType nsmwrt = new NonStaticMethodWithReturnType();
		
		
		System.out.println("MY First Name is : -" +nsmwrt.getFirstName());
		System.out.println("My last Name is :- " +nsmwrt.getLastName());
		System.out.println("My Vailed Email is :-"+nsmwrt.getEmail());
		System.out.println("My Password is :-  " +nsmwrt.getPassword());
		System.out.println("Mobile No. :- " +nsmwrt.getmobile());
		System.out.println("Gender :- " +nsmwrt.getgender());
	}

}
