package com.mkpits.vacations;

import java.util.LinkedHashSet;

public class Example_LinkedHash 
{
	// it is use maintain index order of set

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Pranav");
		lhs.add(223);
		lhs.add('w');
		lhs.add(376363227878676l);
		lhs.add("Ashika");
		
		
		System.out.println(lhs);

	}

}
