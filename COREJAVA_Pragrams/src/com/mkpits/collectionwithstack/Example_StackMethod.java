package com.mkpits.collectionwithstack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class Example_StackMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		System.out.println("Enter Range");
		int range= Integer.parseInt(br.readLine());
		
		Stack<String> st = new Stack<String>();
		
		for (int i = 0; i < range ; i++) 
		{
			st.push(br.readLine());
			
		}
		System.out.println("List is "+st);
	}

}
