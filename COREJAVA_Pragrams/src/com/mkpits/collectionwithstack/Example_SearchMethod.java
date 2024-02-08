package com.mkpits.collectionwithstack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example_SearchMethod 
{
	//It determines whether an object exists in the stack. If the element is found,

	//It returns the position of the element from the top of the stack. Else, it returns -1.
	public static void main(String[] args) {
		
		try 
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		System.out.println("Enter Range");
		int range= Integer.parseInt(br.readLine());
		
		Stack<String> st = new Stack<String>();
		
		for (int i = 0; i < range ; i++) 
		{
			st.push(br.readLine());
			
		}
		System.out.println("List is "+st);
		System.out.println("Enter Element To Search ");
		String sr = br.readLine();
		// search Method
		// it is use to check the position of element in present in stack
		// if element is not present in the stack it give -1 value
		
		System.out.println(st.search(sr));
		System.out.println("Update List "+st);
		
	} catch (Exception e) {
		e.printStackTrace();
	}


	}

}
