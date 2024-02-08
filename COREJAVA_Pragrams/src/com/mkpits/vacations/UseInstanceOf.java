package com.mkpits.vacations;

public class UseInstanceOf 
{
	public static void main(String[] args) 
	{
		Integer [] arr = new Integer[3];
		arr[0]= 9;
		arr[1]= 4;
		System.out.println(arr instanceof Object);
		System.out.println(arr[1] instanceof Integer);
		
		
		Integer i = 12;
		System.out.println(i instanceof Integer);
	}

}
