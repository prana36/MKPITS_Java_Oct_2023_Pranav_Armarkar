package com.mkpits.genericsandcollection;

public class EqualsOperatorsOrEqualsMethod {

	public static void main(String[] args) {
		EqualsOperatorsOrEqualsMethod obj = new EqualsOperatorsOrEqualsMethod();
		obj.equalsMethod();
		obj.equalsOperators();
		

	}

	public void equalsMethod() 
	{
		System.out.println("+++++++++Equal Method Display++++++++");
		String name1 = new String("Pranav");
		String name2 = new String("Pranav");
		
		if (name1.equals(name2)) // In equals method checking internal contain  
		{
			System.out.println("Both Strings Are Equals ");
			
		} else {
			System.out.println("Both String Are Not Equals");

		}
		
		String n1 = "Armarkar";
		String n2 = new String("Armarkar");
		System.out.println(n1.equals(n2));
		
		String car1= "Volvo";
		String car2= "Volvo";
		System.out.println(car1.equals(car2));
		
	}

	public void equalsOperators() {
		
		System.out.println("+++++++++Equal Operator (==) Display++++++++");
		String name1 = new String("Pranav");
		String name2 = new String("Pranav");
		

		if (name1==name2) //In equals method checking internal contain as well as memory Adress
		{
			System.out.println("Both Strings Are Equals ");
			
		} else 
		{
			System.out.println("Both String Are Not Equals");

		}
		
		String n1 = "Armarkar";
		String n2 = new String("Armarkar");
		System.out.println(n1==n2);
		
		String car1= "Volvo";
		String car2= "Volvo";//String pulling ---> having same memory allowcation  
		System.out.println(car1==car2);
		
	}
	

}
