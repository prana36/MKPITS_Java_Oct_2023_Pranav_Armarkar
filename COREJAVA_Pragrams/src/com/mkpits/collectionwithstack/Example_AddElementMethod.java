package com.mkpits.collectionwithstack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example_AddElementMethod 
   //Adds the specified component to the end of this vector, increasing its size by one.
{

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
			System.out.println("Enter Element To Add ");
			String sr = br.readLine();
			// AddElement Method
			// it use to Add Element in Stack and increase size of stack
			st.addElement(sr);
			System.out.println("Update List "+st);
			
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
