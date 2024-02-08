package com.mkpits.collectionprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;

public class Test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Elements ");
//		String str = br.readLine();
		Test2 t = new Test2();
		boolean s = t.isParenthesisMatching(br.readLine());
		System.out.println(s);
		

	}
	boolean isParenthesisMatching(String str) {
		Stack<Character> schar = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch=='(' || ch=='{' || ch=='[') {
				schar.push(ch);
				
				continue;
			}else {
				if(schar.isEmpty()) {
				return false ;
				}
				else if (isMatching(ch, schar.peek())) 
				{
					return false ;
					
				}else {
					schar.pop();
				}
			}
			
			
		}
		//System.out.println("True ");
		return schar.isEmpty();
		
		
	}
	boolean isMatching(char a , char b) 
	{
		return (a=='('&& b==')')||(a=='{'&& b=='}')||(a=='['&& b==']');
		
		
	}

}
