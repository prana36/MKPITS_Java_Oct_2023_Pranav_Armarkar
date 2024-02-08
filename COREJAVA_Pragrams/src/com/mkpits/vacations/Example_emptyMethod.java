package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example_emptyMethod {

	public static void main(String[] args) {
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
			
			//empty Method use to check elements are present or not in Stack
			//It returns true if nothing is on the top of the stack. Else, returns false.	
			
			
			System.out.println(st.empty());
			System.out.println("Update List "+st);
			
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
