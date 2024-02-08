package com.mkpits.collectionwithstack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example_CopyIntoMethod {

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
		

		String []pra = new String[range];
		
		st.copyInto( pra);
		for (String string : pra) {
			System.out.println(string);
		}

		System.out.println("Update List "+st);
		
	} catch (Exception e) {
		e.printStackTrace();
	}


	}

}
