package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Example5_HashMap {

	public static void main(String[] args) {
		// 
		Map<String, String> map = new HashMap<String, String>();
		map.put("A to C", "Pranav");
		map.put("D To G", "Karan");
		map.put("H to K", "Kaustubh");
		map.put("L to P", "sevakram");
		map.put("Q to Z", "Dadaraoji");
		
		// using Lambda Expression
		map.keySet().forEach(n-> System.out.print(n+"--"));
		map.values().forEach(n-> System.out.print(n+"--"));
		

	}

}
