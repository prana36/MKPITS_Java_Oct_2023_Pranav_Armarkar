package com.mkpits.genericsandcollection;

import java.util.ArrayList;

public class Example_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<StudentData> at = new ArrayList<StudentData>();
		
		at.add(new StudentData("Pranav", 676376762l));
		at.add(new StudentData("Kaustubh", 9988788978l));
		at.add(new StudentData("Ashik", 98878776l));
		at.add(new StudentData("Arvind", 787676767l));
		at.add(new StudentData("Pinky", 6878278171l));
		
		
		ArrayList<StudentData> at1 = new ArrayList<StudentData>();
		at1.add(new StudentData("Dahiwale", 98878776l));
		at1.add(new StudentData("vaibhav", 787676767l));
		at1.add(new StudentData("Sami", 6878278171l));
		at1.add(new StudentData("Ashik", 98878776l));
		
		
		System.out.println("Student 1\n");
		
		for (StudentData studentData : at) 
		{
			System.out.println(studentData);
			
		}
		System.out.println("Student 2\n");
		
		for (StudentData studentData : at1) {
			System.out.println(studentData);
		}
		
		System.out.println("After add\n++++++++++++++++++++++++++++++++++++++++++++++");
		at.addAll(at1);
		for (StudentData studentData : at) 
		{
			System.out.println(studentData);
			
		}
		
		

	}

}
