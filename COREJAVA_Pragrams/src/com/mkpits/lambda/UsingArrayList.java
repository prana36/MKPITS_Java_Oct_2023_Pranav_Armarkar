package com.mkpits.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class UsingArrayList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		System.out.println("Enter Range");
		int range= Integer.parseInt(br.readLine());
		
		Stack<String> st = new Stack<String>();
		
		for (int i = 0; i < range ; i++) 
		{
			st.push(br.readLine());
			
		}
		//System.out.println("List is "+st);
		st.forEach(n -> System.out.println("Array Element is :- "+n));
		st.forEach(System.out::println);

	}

}
