package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingTernaryOperators {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Num. :- ");
		int num1 =Integer.parseInt(br.readLine());
		int num2 =Integer.parseInt(br.readLine());

		
		
//		if (num1>num2) {
//			System.out.println("Num1 is greater");
//			
//		} else {
//			System.out.println("num2 is greater");
//
//		}
		
		String output = (num1>num2)?"num1 is greater":"num2 is greater";
		System.out.println(output);
		//System.out.println((num1>num2)?"num1 is greater":"num2 is greater");
	}

}
