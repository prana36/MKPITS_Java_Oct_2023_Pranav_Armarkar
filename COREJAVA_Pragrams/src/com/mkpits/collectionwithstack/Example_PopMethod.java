package com.mkpits.collectionwithstack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example_PopMethod {
	// to search
	//1) serialized and de-serialized
	// 2)maker Interface

	public static void main(String[] args) 
	{
		try {
			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		System.out.println("Enter Range");
		int range= Integer.parseInt(br.readLine());
		
		Stack<String> st = new Stack<String>();
		
		for (int i = 0; i < range ; i++) 
		{
			st.push(br.readLine());
			
		}
		System.out.println("List is "+st);
		
		st.pop();// It Remove Last in First out 
		System.out.println("Update List "+st);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


