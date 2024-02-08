package com.mkpits.genericsandcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTestBuffer {
	

	public static void main(String[] args) throws NumberFormatException, IOException  
	{
		
		double petrolPrice= 0 ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Double> price = new ArrayList<Double>();
		
		
			System.out.println("Enter Range :- ");
			int range = Integer.parseInt(br.readLine());
			
			
			for (int i = 0; i < range; i++) {
				System.out.print(i+1+").Enter Previous Petrol Prices :- ");
				
				petrolPrice = Double.parseDouble(br.readLine());
				price.add(petrolPrice);
			}
			for (Double double1 : price) {
				System.out.println("Petrol Price:- "+double1);
			}
			
		
	}

}
