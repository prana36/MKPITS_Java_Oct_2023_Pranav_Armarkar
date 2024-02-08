package com.mkpits.collectionwithset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Example1 {

	public static void main(String[] args) 
	{
		// Creating an object of Set class  
        // Declaring object of Integer type
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer [] {1, 3, 2, 4, 8, 9, 0}) );
		
		
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer [] {1, 3, 7, 5, 4, 0, 7, 5}));
		
		  // To find union 
        Set<Integer> union = new HashSet<Integer>(set1); 
        union.addAll(set2); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
		

	}

}
