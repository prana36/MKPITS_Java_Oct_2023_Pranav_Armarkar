package com.mkpits.variableScope;

import com.mkpits.datatype.*;

public class CallFromOtherClass {
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
		CallFromOtherClass cfoc= new CallFromOtherClass();
		System.out.println("pincode:- " +cfoc.pinCode);
		System.out.println("mobile:- " +cfoc.mobile);
		System.out.println("name:- " +cfoc.name);
		System.out.println("rollNo:- " +cfoc.rollNo);
		System.out.println("gender:- " +cfoc.ismale);
		System.out.println("transectionId:- " +cfoc.transectionId);
		System.out.println("workId:- " +cfoc.workId);
		System.out.println("panId:- " +cfoc.panId);
		StaticVariable sv= new StaticVariable();
		System.out.println("Pranav Salary :-" +sv.pranavSalary);
	
		LongDataType ldt= new LongDataType();
		System.out.println("name:- "+ldt.name);
		
		ByteDataType bdt=new ByteDataType();
		System.out.println("My friend is " +bdt.myFrindName);
	}

}
