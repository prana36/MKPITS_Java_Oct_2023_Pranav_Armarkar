package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingMultipleCatch {

	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		int x = 90, y = 0;

		try 
		{
			System.out.println(arr[3]);
			System.out.println(x / y);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException ae) {
			ae.printStackTrace();
		}

		System.out.println("Exception ");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name");
		try {
			String name = reader.readLine();
		} catch (ArithmeticException e) {

			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally 
		{
			System.out.println("Connection Close");
		}

		 

	}

}
