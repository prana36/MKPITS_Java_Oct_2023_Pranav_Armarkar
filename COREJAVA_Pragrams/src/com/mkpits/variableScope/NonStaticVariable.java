package com.mkpits.variableScope;

public class NonStaticVariable {
	public int pinCode ;
	public long mobile ;
	public char name ;
	public byte rollNo ;
	public boolean gender ;
	public short transectionId;
	public float workId;
	public double panId;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //implementation
		NonStaticVariable nsv= new NonStaticVariable();
		System.out.println("pincode:- " +nsv.pinCode);
		System.out.println("mobile:- " +nsv.mobile);
		System.out.println("name:- " +nsv.name);
		System.out.println("rollNo:- " +nsv.rollNo);
		System.out.println("gender:- " +nsv.gender);
		System.out.println("transectionId:- " +nsv.transectionId);
		System.out.println("workId:- " +nsv.workId);
		System.out.println("panId:- " +nsv.panId);
		

	}

}
