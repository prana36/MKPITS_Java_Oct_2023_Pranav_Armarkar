 package com.mkpits.typecasting;
// type casting is a method or process that converts a data type into another data type 
//in both ways manually and automatically.

public class ImplicitTypeCasting {
	//Implicit Type Casting (Widening Type Casting)
	//it Converting a lower data type into a higher one
	//It is done automatically. 
    // byte -> short -> char -> int -> long -> float -> double 
	// it can not convert short type into short type 
	// implementation
	public static void main(String[] args) 
	{
		byte rollNo=109;
		System.out.println("rollNo :- "+rollNo);
		
		//automatically converts the byte type into int type  
		int class1=rollNo;
		System.out.println("class1 roll no.  :- "+class1);
		
		//automatically converts the integer type into long type  
		long class2=class1;
		System.out.println("class2 roll no. :- "+class2);
		
		//automatically converts the long type into float type  
        float class3=class2;
        System.out.println("class3 roll no. :- "+class3);
        
        
	}

}
