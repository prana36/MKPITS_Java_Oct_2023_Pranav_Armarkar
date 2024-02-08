package com.mkpits.exceptionhandling;

public class UsingTryCatch {
	//Try Catch is use to Throws exception

	public static void main(String[] args) 
	{
		int [] arr = new int[5];
		
		try {
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e)  //add exception name or Add super Class i.e Exception 
		{
			e.printStackTrace(); //This method prints a stack trace for this Throwable object on the error output stream that is the value of the field System.err. 
		}
		
		
		int x= 10,y=0;
		
		try {
			System.out.println(x/y);  
			
		} catch (ArithmeticException e) //add exception name or Add super Class i.e Exception
		{
			e.printStackTrace(); //This method prints a stack trace for this Throwable object on the error output stream that isthe value of the field System.err.
		}
		
	}

}
