package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingWhileLoop {
	
	static BufferedReader br ;
	
	String name,mob,age,aadhar,accountType,email;
	long  accountNumber,deposit,withdraw,balance;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("लेना देना बँक");
		UsingWhileLoop obj = new UsingWhileLoop();
		
		
		
         br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch = 'Y';
		while (ch== 'y' || ch == 'Y') {
			
			
			System.out.println("Select you Type :-  \n1.Create Account\n2.Deposit\n3.Withdraw\n4.Check Balance\n5.Account Details");
			int type = Integer.parseInt(br.readLine());
			
			
			switch (type) {
			case 1:
				obj.creatAccount();
				
				break;

				
			case 2:
				obj.deposit();
				
				break;
				
			case 3:
				obj.withdraw();
				
				break;
				
			case 4:
				obj.checkBalance();
				
				break;
				
			case 5:
				obj.accountDetails();
				
				break;

			default:
				break;
			}
			
          System.out.println("Do you Want To contineou :- " );
          ch = (char) br.read();
			br.readLine();
	    }
		
		
	}

	private void creatAccount() throws IOException {
		System.out.print("Enter Your Name:- ");
		name=br.readLine();
		
		System.out.print("Enter Your Mobile No. :- ");
		mob=br.readLine();
		
		System.out.print("Enter Your Adhar No. :- ");
		aadhar=br.readLine();
		
		System.out.print("Enter Your Age :- ");
		age=br.readLine();
		
		System.out.print("Enter Your Account Type :- ");
		accountType=br.readLine();
		
		System.out.print("Enter Your Email :- ");
		email=br.readLine();
	
		
		
		//Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);    
        //Create instance of matcher   
        Matcher matcher = pattern.matcher(email);  
        if (!matcher.matches()) {
				System.out.println("Email Not Valid");
			}  
		
		
		
		
		System.out.print("Add some amount :- ");
		balance=Long.parseLong(br.readLine());
		
		
		
		accountNumber = (long)Math.floor(Math.random()*1000000);
		System.out.println("Your Account Has Been Created \n Your Account No. is  "+accountNumber);
		
		
		
	}
	public void deposit() throws NumberFormatException, IOException {
		System.out.print("Enter Deposit Amount :- ");
		 deposit=Long.parseLong(br.readLine());
		 System.out.println("Deposit succefully");
		 balance+=deposit;
		 System.out.println("Now Your balance is  "+balance);
		
	}
	private void withdraw() throws NumberFormatException, IOException {
		System.out.print("Enter Withdraw Amount :- ");
		 withdraw =Long.parseLong(br.readLine());
		 System.out.println("Withdraw succefully");
		 balance-=withdraw;
		 System.out.println("Now Your balance is  "+balance);
		
	}
	private void checkBalance() {
		System.out.println("Your Balance is "+balance);
		
		
		
	}

	private void accountDetails() {
		System.out.print("Account Holder Name:- "+name);
		System.out.print("Aadhar :- "+aadhar);
		System.out.print("Mobile No. :- "+mob);
		System.out.print("Age :- "+age);
		System.out.print("Account Type :- "+accountType);
		System.out.print("Email :- "+email);
		System.out.print("Account No. :- "+accountNumber);
		System.out.println("Your Balance is "+balance);
		
	}

}
