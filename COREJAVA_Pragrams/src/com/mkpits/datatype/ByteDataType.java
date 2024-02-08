package com.mkpits.datatype;

public class ByteDataType {
	public String myFrindName="Ashik";

	public static void main(String[] args) {
		//Logical - Byte Datatype
	    //Default value is "0"
	    //it returns value is (Defualt vale):- zero
	   // Memory Size - 8 bits(1 byte)
	   // it ranges Between  -128 to 127 (total 0-255[256])... [ using these formula ->-2 n-1 to 2n-1 -1(only for integral)]
			
	     //Implementation
         byte num1=26;
         byte num2=127;
         //(byte num2=128;  do not accept these range in byte datatype due to range
         //byte num2=-128;  do not accept these range in byte datatype due to range
         System.out.println("Number1:- " +num1);
         System.out.println("Number2:- " +num2);
         
	}

}
