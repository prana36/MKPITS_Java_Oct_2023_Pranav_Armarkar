package com.mkpits.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudent() {
		
		// Creat an Empty List
     		
	List<Student> student= new ArrayList<Student>();
	
	// Add Data
	student.add(new Student("Pranav","Armarkar","pranavarmarkar@gmail.com"));
	student.add(new Student("Raj","warhokar","raj@gmail.com"));
	student.add(new Student("Ashik","Tembhare","ashik@gmail.com"));
	student.add(new Student("Kaustubh","Anjankar","anjankar@gmail.com"));

	
	//return list
	return student;
	}

}
