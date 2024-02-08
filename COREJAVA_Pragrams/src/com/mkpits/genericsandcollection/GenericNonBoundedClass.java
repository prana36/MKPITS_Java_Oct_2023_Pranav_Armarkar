package com.mkpits.genericsandcollection;

public class GenericNonBoundedClass {

	public static void main(String[] args) {
		Integer[] intData = {1,2,3,4,5,6,7,8,9,10};
		PrintD<Integer> printInt = new PrintD<Integer>();
		printInt.print(intData);
		
		System.out.println("*******************************************");
		
	    Double[] douData = {12.34,23.45,67.45,23.67,89.20};
	    PrintD<Double> printdou= new PrintD<Double>();
	    printdou.print(douData);
	    System.out.println("*******************************************");
	  
	    String[] strData = {"Pranav","Ashik","Raj","Kaustubh","Vaibhav","Samiksha","Harsh"};
	    PrintD<String> printstr = new PrintD<String>();
	    printstr.print(strData);

	}


}
//In this class Declearation only one class is public 
 class PrintD<T> 
//Generic Non Bounded Class 
{
public void print(T[] arr) 
{
	for (T t : arr) {
		System.out.println("Value is "+t);
	}  
}
}
