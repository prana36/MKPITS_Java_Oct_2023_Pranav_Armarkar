package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public interface Example_HashCodeMethod 
{
	public static void main(String[] args) 
	{
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Range ");
		int range = Integer.parseInt(br.readLine());
		
		Set set = new HashSet();
		
		for (int i = 0; i < range; i++) 
		{
			set.add(br.readLine());
		}
		System.out.println(set);
		
		System.out.println(set.hashCode());
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
