package com.mkpits.typecasting;

public class TypeCastingBetweenPrimitiveToObjectAndViceVersa {
	//
	//double -> float -> long -> int -> char -> short -> byte
	

	public static void main(String[] args) {
		// primitive To Object
		
		double salary = 150000.56 ;
		Float newSalary = new Float(salary);  
		System.out.println(newSalary);
		
		
		int rateOfTea = 20;
		Long l = new Long(rateOfTea);
		System.out.println(l);
		
		
		
		
		//object to primitive
		String Bill = "346";
		int a = Integer.parseInt(Bill);
		System.out.println(a);
		
		
		
		
	}

}
