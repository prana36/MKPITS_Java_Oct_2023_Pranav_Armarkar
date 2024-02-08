package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEachArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter choice  ");
        int choice = Integer.parseInt(br.readLine());
		
        System.out.println("Enter Mobile Numbers:- ");	
       long mob[]=new long[choice];
		
      
		for (int i = 0; i < mob.length; i++) {
			mob[i]=Long.parseLong(br.readLine());
			
		}
//		for (int j = 0; j < mob.length; j++) {
//			
//			System.out.println("The value of "+(j+1)+":"+mob[j]);
//		}
//		
		// basically we used for each to print directly 
		
		for (long l : mob) {
			System.out.println("Number is :-   "+l);
		}
		
        
		String studentName[]= {"Pranav","Ashik","Manish","Kaustubh","Vaibhav","Raj","Gunjan","Sami"};
		
		
	for (String newName : studentName) {
		System.out.println(""+newName);
		
	}	
		
		
	}

}
