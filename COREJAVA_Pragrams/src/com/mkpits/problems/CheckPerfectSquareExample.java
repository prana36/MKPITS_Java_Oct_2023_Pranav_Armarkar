package com.mkpits.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPerfectSquareExample {
	public static void main(String[] args) throws NumberFormatException, IOException   
	{   
	//object of the Scanner class  
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
	System.out.print("Enter a number: ");   
	//reading a number of type double from the user  
	double number=Double.parseDouble(br.readLine());   
	if (checkPerfectSquare(number))   
	System.out.println("Yes, the given number is perfect square.");  
	else  
	System.out.print("No, the given number is not perfect square.");   
	}  
	//user-defined method that checks the number is perfect square or not   
	static boolean checkPerfectSquare(double number)   
	{   
	for (int i=1; i*i<=number; i++)   
	{   
	//if (i * i = number)   
	//comparing conditions using logical AND  
	if((number%i==0) && (number/i==i))   
	{   
	//returns true if both conditions are true      
	return true;   
	}   
	}   
	//returns false if any one condition is false  
	return false;   
	}   

}
