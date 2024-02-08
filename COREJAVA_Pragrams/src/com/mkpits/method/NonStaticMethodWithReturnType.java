package com.mkpits.method;

public class NonStaticMethodWithReturnType
{
	public static void main(String[] args) 
{
	NonStaticMethodWithReturnType nsmwrt = new NonStaticMethodWithReturnType();
	
	
	System.out.println("MY First Name is : -" +nsmwrt.getFirstName());
	System.out.println("My last Name is :- " +nsmwrt.getLastName());
	System.out.println("My Vailed Email is :-"+nsmwrt.getEmail());
	System.out.println("My Password is :-  " +nsmwrt.getPassword());
	System.out.println("Mobile No. :- " +nsmwrt.getmobile());
	System.out.println("Gender :- " +nsmwrt.getgender());
}

	//  non-static method 
  

		public String getPassword() {
			String password= "mai nahi bataonga";
			return password;
			
		}

		public String getgender() 
		{
			String gender = "Male";
			return gender ;
			
		}

		public long getmobile() 
		{
			long mobile = 7890469694l;
			return mobile;
		}

		public String getEmail() 
		{
			String email= "pranavarmarkarf36@gmail.com";
			return email ;
			
		}

		public String getLastName() {
			String lname= "Armarkar";
			return lname;
			
		}

		public String getFirstName() 
		{
			String name = "Pranav";
			return name;
		}
		
			
}
