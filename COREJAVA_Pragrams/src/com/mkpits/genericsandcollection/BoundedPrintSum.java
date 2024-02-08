package com.mkpits.genericsandcollection;

public class BoundedPrintSum<T extends Number> 
//if we extends this Class form Number it get only numeric Data 
{
	public void print(T[] arr) 
	  {
		double sum = 0;
		for (T x : arr) {
			sum=sum+ x.doubleValue();
			
		}  
		System.out.println("Sum is = "+sum);
	  }
}
