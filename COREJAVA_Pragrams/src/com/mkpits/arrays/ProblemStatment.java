package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ProblemStatment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ProblemStatment p=new ProblemStatment();
		p.checkSmallestNum();

	}

    void checkSmallestNum() throws NumberFormatException, IOException 
    {
    	
    	
    	
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter Range :- ");
	    int range= Integer.parseInt(br.readLine());
		int num[]=new int[range];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=Integer.parseInt(br.readLine());
			
		}
		for (int dis : num) {
			System.out.print(" "+dis);
		}
//		for (int i = 0; i < num.length; i++) 
//		{
//			System.out.println(num[i]);
//			
//		}
		
		
		for (int i = 0; i < num.length; i++) 
		{
			 
			
			
		}
		
		
	}
	
    
	
}
