package com.mkpits.genericsandcollection;

public class PrintData<T> 
// Generic Non Bounded Class 
{
  public void print(T[] arr) 
  {
	for (T t : arr) {
		System.out.println("Value is "+t);
	}  
  }
}
