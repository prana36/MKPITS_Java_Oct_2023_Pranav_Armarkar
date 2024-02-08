package com.mkpits.method;

public class MethodWithReturnTypeAndArgument {

	public static void main(String[] args) {
		
		MethodWithReturnTypeAndArgument mwrtaa = new MethodWithReturnTypeAndArgument();
		String output = mwrtaa.getDetails(36,100000);
		String output1 = mwrtaa.getMyDiscription("CEO \n","Manager");
		System.out.println(output);
		System.out.println("..................................................");
		System.out.println(output1);

	}

	public String getMyDiscription(String myPost , String otherPost) {
		String work = "I am "+myPost ;
		System.out.println();
		String work2 = "Ashik is "+otherPost;

		return work + work2 ;
	}

	public String getDetails(int id , int salary) 
	{
		double incentive = salary +(salary*0.1);
		String details = "My Id is :-"+id + ", My Salary is "+incentive;
		return details ;
		
		
	}

}
