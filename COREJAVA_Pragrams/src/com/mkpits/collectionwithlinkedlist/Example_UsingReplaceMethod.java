package com.mkpits.collectionwithlinkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Example_UsingReplaceMethod 
{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Range Of List :- ");
		int range = Integer.parseInt(br.readLine());
		List<String> lt = new LinkedList<String>();
		
		
		for (int i = 0; i < range ; i++) 
		{
			lt.add(br.readLine());
		}
      // Display the initial elements in List
		System.out.println("Array List Is :- "+lt);
		System.out.println("Size Of List is "+lt.size());
		// remove Method
		System.out.println("Enter position to replace :- ");
		int po = Integer.parseInt(br.readLine());
		lt.remove(po-1);
		System.out.println(lt);
		
	}

}
