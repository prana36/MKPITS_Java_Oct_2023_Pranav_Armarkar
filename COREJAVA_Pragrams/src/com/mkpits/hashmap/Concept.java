package com.mkpits.hashmap;

import java.util.HashMap;

public class Concept 
{
//	In Java, HashMap is a part of Java’s collection since Java 1.2. 
//	This class is found in java.util package. 
//It provides the basic implementation of the Map interface of Java. 
//	HashMap in Java stores the data in (Key, Value) pairs, 
//	and you can access them by an index of another type (e.g. an Integer).
//	One object is used as a key (index) to another object (value). 
//	If you try to insert the duplicate key in HashMap, 
//	it will replace the element of the corresponding key. 

	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Karan");
		map.put(2, "Ashik");
		map.put(3, "Regved");
		map.put(4, "Kaustubh");
		map.put(5, "Vaibhav");
		map.put(2, "Sevakram");
		
		System.out.println(map);

	}

}
