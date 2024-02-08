package com.mkpits.method;

public class MethodOverLoading {
	//Method Overloading
    //when more than one method having same method name but having different parameter and different no. aurgument
	// In method overloading we can change the no. of parameters and their sequences
	// in these Method overloading return type do not play important role 

	public static void main(String[] args) {
		MethodOverLoading mol=new MethodOverLoading();
		
		mol.getData();// no parameter and not passing any type of aurgument
		System.out.println(mol.getData(7774863377l)); //parameter and passing aurgument
		System.out.println(mol.getData('M',"Error"));
		System.out.println(mol.getData(1333, 332, 18787.455f, "NIKE AIR 1", 7000));

		

	}

	public void getData() 
	{
		// no return type using void here
		// no parameter and not passing any type of aurgument
		String name="Pranav"; 
		System.out.println("My Name Is:- "+name);
		
	}
	public long getData(long mob) {
		//using return type 
		//parameter and passing aurgument 
		return mob;
		
	}
	public String getData(char gender,String password) {
		
		return password;
		
	}
	public String getData(int id ,long custmoreType ,float income, String productName ,double price){
		//String fullDetails= " "+id+ " " +custmoreType+" "+income+" "+productName+" "+price;
		//return fullDetails;
		return  "Id :- "+id+ " \nCustmer Type :-  " +custmoreType+"\nIncome : "+income+"\nProduct NAme : "+productName+"\nPrice : "+price;
	}
	

}
