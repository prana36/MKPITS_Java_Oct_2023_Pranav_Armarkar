package com.mkpits.oprators;

public class ArithmaticOprators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticOprators ao = new ArithmaticOprators();
		ao.add();
		// using parameterise 
		System.out.println("Substraction is =  "+ao.sub(15,5));
		// below statement is use when we use return type
		System.out.println("Multipication is = "+ao.multi());
		ao.div();
	}

	public void div() {
		double x=12 ,y=9;
		double div=x/y;
		System.out.println("Divvision is = "+div);
		
		
	}
	// using return type 

	public int multi() {
		int p=24,k=4;
		int multi=p*k;
		//System.out.println("Multipication is = "+multi);
		return multi;
	}
	// using parameterise 
	public int sub(int a ,int b) {
		
		int sub=a-b;
		//System.out.println("Substraction is =  "+sub );
		return sub;
	}

	public void add( ) 
	{
		int a=10, b=23 ;
		int sum=a+b;
		System.out.println("Sum Of Two No. is = "+sum);
		
		
	}

}
