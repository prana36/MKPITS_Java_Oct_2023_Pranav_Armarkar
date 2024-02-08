 package com.mkpits.thiskeyword;
// Using "This" Keyword 
//it use refers to the current object in a method or constructor.
//
//
public class Using_This_Keyword { 
	String customerName;
	long customerId;
	String product;
	int productId;
	float price;
	

	public static void main(String[] args) {
		//calling to variables
		
		Using_This_Keyword utk=new Using_This_Keyword(4544l,6969,800.69f);//creat object and passing aurguments  
		System.out.println("CustomerId:- "+utk.customerId+"   ProductId:- "+utk.productId+"   Price:- "+utk.price);
		
		utk.getAllData("Pranav","Jockey");
		System.out.println("Customer Name:- "+utk.customerName+"      Product:-  "+utk.product);
	}//constructor
	 public Using_This_Keyword(long customerId, int productId, float price) {
		 //called to variables
		 this.customerId=customerId;// refers these value to above variable
		 this.productId=productId;// refers these value to above variable
		 this.price=price;// refers these value to above variable
	 
		 
	}//Method
	public void getAllData(String customerName ,String product) {
		
		this.customerName=customerName;    // refers these value to above variable
		this.product=product;          // refers these value to above variable
		
	}

}
