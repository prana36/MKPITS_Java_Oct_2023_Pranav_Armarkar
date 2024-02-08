package com.mkpits.genericsandcollection;

public class GenericsClass {

	public static void main(String[] args) {
		Integer[] intData = {1,2,3,4,5,6,7,8,9,10};
		PrintData<Integer> printInt = new PrintData<Integer>();
		printInt.print(intData);
		
		System.out.println("*******************************************");
		
	    Double[] douData = {12.34,23.45,67.45,23.67,89.20};
	    PrintData<Double> printdou= new PrintData<Double>();
	    printdou.print(douData);
	    System.out.println("*******************************************");
	  
	    String[] strData = {"Pranav","Ashik","Raj","Kaustubh","Vaibhav","Samiksha","Harsh"};
	    PrintData<String> printstr = new PrintData<String>();
	    printstr.print(strData);

	}

}
