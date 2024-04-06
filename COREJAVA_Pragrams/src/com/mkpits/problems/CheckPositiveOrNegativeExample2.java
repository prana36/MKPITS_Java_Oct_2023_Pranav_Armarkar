package com.mkpits.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPositiveOrNegativeExample2 {
	public static void main(String[] args) throws NumberFormatException, IOException   
	{  
	int num;  
	//object of the Scanner class  
	BufferedReader br = new BufferedReader(new InputStreamReader( System.in));  
	System.out.print("Enter a number: ");  
	//reading a number from the user  
	num =Integer.parseInt(br.readLine()) ;  
	//checks the number is greater than 0 or not  
	if(num>0)  
	{  
	System.out.println("The number is positive.");  
	}  
	//checks the number is less than 0 or not  
	else if(num<0)  
	{  
	System.out.println("The number is negative.");  
	}  
	//executes when the above two conditions return false  
	else  
	{  
	System.out.println("The number is zero.");  
	}  
	}  

}
