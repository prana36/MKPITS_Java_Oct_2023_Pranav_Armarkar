package com.mkpits.collectionwithset;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Example_itreatorMethod {

	public static void main(String[] args) {
		
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Ravi");//Adding object in arraylist  
			list.add("Vijay");  
			list.add("Ravi");  
			list.add("Ajay");  
			//Traversing list through Iterator  
			java.util.Iterator<String> itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			

	}

}
