package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllMethod {

	public static void main(String[] args) {
		
		List<String> car1 = new ArrayList<String>();
		
		if (car1.isEmpty()) {
			
		car1.add("Sentro");
		car1.add("Alto");
		car1.add("BMW");
		car1.add("Volvo");
		car1.add("Sentro");
		}
		
		
		List<String> car2 = new ArrayList<String>();
		
		if (car2.isEmpty()) {
		car2.add("Fait");
		car2.add("Tata");
		car2.add("Yodha");
		car2.add("Kia");
		car2.add("Sentro");
		}
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		car1.removeAll(car2);
		for (String str1 : car1) {
			System.out.println(str1);
			
		}
		
		
		

	}

}
