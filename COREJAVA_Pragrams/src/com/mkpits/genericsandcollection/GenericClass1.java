package com.mkpits.genericsandcollection;

public class GenericClass1 
{ 
	public static void main(String[] args) {
		Integer[] intData = {1,2,3,4,5,6,7,8,9,10};
		BoundedPrintSum<Integer> printInt = new BoundedPrintSum<Integer>();
		printInt.print(intData);
		
		System.out.println("*******************************************");
		
	    Double[] douData = {12.34,23.45,67.45,23.67,89.20};
	    BoundedPrintSum<Double> printdou= new BoundedPrintSum<Double>();
	    printdou.print(douData);
	    System.out.println("*******************************************");
	  
	    
	    //The Class which creat object is extend form Number Predefine-Class
	    //// it get only numeric Data 
	    // so that it is not applicable String data 
	    
	    
	    
//	    String[] strData = {"Pranav","Ashik","Raj","Kaustubh","Vaibhav","Samiksha","Harsh"};
//	    BoundedPrintSum<String> printstr = new BoundedPrintSum<String>();
//	    printstr.print(strData);

	}


}
