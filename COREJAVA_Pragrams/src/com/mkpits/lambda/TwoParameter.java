package com.mkpits.lambda;

public class TwoParameter {

	public static void getTwo1(TwoParameterInterface inter , Integer a1 ,Integer a2) 
	{
		inter.getTwo(a1, a2);
		
	}
	public static void main(String[] args) 
	{
		getTwo1((x1, x2)-> System.out.println(x1+ " " +x2), 10 ,20 );

	}

	

}
