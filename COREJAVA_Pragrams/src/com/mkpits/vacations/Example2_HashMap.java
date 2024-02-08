package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Example2_HashMap {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Range:- ");
			int range = Integer.parseInt(br.readLine());
			 Map<Integer, String> map = new HashMap<Integer, String>();
			 
			 System.out.println("Enter Elements :- ");
	 		for (int i = 0; i < range; i++) 
	 		{
				map.put(Integer.parseInt(br.readLine()), br.readLine());
			}
	 		System.out.println("Map is :- "+map);
	 		
	 		
	 		for (Map.Entry<Integer, String> entry : map.entrySet()) {
				Integer key = entry.getKey();
				String val = entry.getValue();
				
				System.out.println("Key is:-  "+key+"  Value:- "+val);
			}
	 		
		}catch (Exception e) {
		   e.printStackTrace();
		}
	}

}
