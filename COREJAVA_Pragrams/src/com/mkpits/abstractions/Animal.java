package com.mkpits.abstractions;


// Abstract Class 
public abstract class Animal 
{
	//Abstract method (does not have Body )
   public abstract void animalSound();

	//Regular Method
	public void sleep() {
		System.out.println("Zzzzz");
		
	}
}
