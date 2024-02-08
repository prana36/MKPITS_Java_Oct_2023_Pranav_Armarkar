package com.mkpits.typecasting;

public class ExplicitTypeCasting {
	//Explicit Type Casting (Narrowing Type Casting )
	//i)Type Casting between primitive types
	//it Converting a higher data type into a lower one 
    //It is done manually by the programmer
	//double -> float -> long -> int -> char -> short -> byte
	

	public static void main(String[] args) {
		double petrolIncentive = 2334.45;  
		System.out.println("petrolIncentive: "+petrolIncentive);
		
		//converting double data type into long data type  
		long l = (long)petrolIncentive;  
		System.out.println("First Employee  petrolIncentive: "+l);
		
		//converting long data type into int data type  
		int i = (int)l; 
		System.out.println("second Employee  petrolIncentive: "+i); 
		  
		
	}

}
