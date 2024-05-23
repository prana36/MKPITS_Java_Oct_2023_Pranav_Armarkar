package com.mkpits.collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpolyeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ModelEmpClass> employee = new ArrayList<ModelEmpClass>();
		employee.add(new ModelEmpClass(20 , "Pranav"));
		employee.add(new ModelEmpClass(21 , "Kaustubh"));
		employee.add(new ModelEmpClass(23 , "Raj"));
		employee.add(new ModelEmpClass(24 , "Samiksha"));
		employee.add(new ModelEmpClass(27 , "Karan"));
		
		for (Iterator iterator = employee.iterator(); iterator.hasNext();) {
			ModelEmpClass modelEmpClass = (ModelEmpClass) iterator.next();
			System.out.println(modelEmpClass);
	
		}
		System.out.println("****************************************************************");
		System.out.println();
		System.out.println("Using For Each");
		System.out.println("*****************************************************************");
		for (ModelEmpClass modelEmpClass : employee) {
			System.out.println(modelEmpClass);
		}
	}

}
