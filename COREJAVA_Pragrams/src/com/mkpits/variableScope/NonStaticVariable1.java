package com.mkpits.variableScope;

public class NonStaticVariable1 {
	public int pinCode=441111;
	public long mobile= 9873637206l;
	public char name='P' ;
	public byte rollNo=69 ;
	public boolean ismale= true ;
	public short transectionId=656;
	public float workId=4352f;
	public double panId=65556756;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticVariable1 nsv= new NonStaticVariable1();
		System.out.println("pincode:- " +nsv.pinCode);
		System.out.println("mobile:- " +nsv.mobile);
		System.out.println("name:- " +nsv.name);
		System.out.println("rollNo:- " +nsv.rollNo);
		System.out.println("gender:- " +nsv.ismale);
		System.out.println("transectionId:- " +nsv.transectionId);
		System.out.println("workId:- " +nsv.workId);
		System.out.println("panId:- " +nsv.panId);
	}

}
