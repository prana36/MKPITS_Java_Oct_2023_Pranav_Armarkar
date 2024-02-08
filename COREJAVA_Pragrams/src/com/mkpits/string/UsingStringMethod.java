package com.mkpits.string;

public class UsingStringMethod {

	public static void main(String[] args) {
		UsingStringMethod usm = new UsingStringMethod(); // class object
		// method calling
		usm.allStringMethod();
		
		
		
	}

	  void allStringMethod() {
		  //called Method
		
		String name = "pranav";
		String sName = "PRANAV";
		System.out.println(name.charAt(2));
		System.out.println(name.compareTo(sName));
		System.out.println(name.trim());// it use to trim the spaces
		System.out.println(name.codePointCount(3, 5));// it print in between index value
		System.out.println(name.endsWith(name));//
		System.out.println(String.join("-",name, sName));
		System.out.println(name.compareToIgnoreCase(sName));
		System.out.println(name.concat(sName));
		System.out.println(name.contains(sName));//
		System.out.println(name.contentEquals(sName));// check String name is equal to String sName 
		System.out.println(name.endsWith("v"));// it check String end from v or not it gives boolean value
		System.out.println(sName.replace('A', 'b'));//it replace value A to b 
		System.out.println(sName.replaceAll(sName, "ARMARKAR"));
		System.out.println();
		
		System.out.println(name.toLowerCase());//converts in small letters in string name 
		System.out.println(name.toUpperCase());//converts in capital letters in string name
		
		//chaining also possible in string method 
		System.out.println(name.toUpperCase().charAt(3));
		
		

		byte b[] = {50,45,66,45,89,23};
		char ch []= {'a','b','c','d','e'};
		
		
		String s =new String();// it is inbiuld constructor
		System.out.println(s);
		
		String s1 =new String(b);
		System.out.println(s1);
		
		String s2 =new String(b,0,3);
		System.out.println(s2);
		
		String s3 =new String(ch);
		System.out.println(s3);
		
		String s4=new String(ch, 1,3);
		System.out.println(s4);
	}

}
