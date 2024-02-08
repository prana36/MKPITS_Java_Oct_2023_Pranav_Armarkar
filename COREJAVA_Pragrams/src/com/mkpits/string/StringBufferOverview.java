package com.mkpits.string;

public class StringBufferOverview {


	public static void main(String[] args) {
		
	 StringBufferOverview sbo = new StringBufferOverview();
	 sbo.stringBufferMethod1();
	 sbo.StringBufferMethod2();
		
		
	}


	private void stringBufferMethod1() {
		 //Stringbuffer 
		 // It is a class  which has multiple methods 
		 //StringBuffer is Enbuild Class
		 // Always creat object when we use StringBuffer and pass String like below
		 
		 String name = "Pranav Armarkar";
		 StringBuffer sb = new StringBuffer(name);
		 
		 String branch = " CS in Deep";
		 String profession = "Developer"; 
		 
		 //StringBuffer implements Comparable but does not override equals. like
		 //sb = sb.append(branch.append(profession));
		  sb = sb.append(branch+" "+profession);// it simply add two string 
		 System.out.println(sb);
		 
		 //it simply reverse two string 
		 
		// System.out.println(sb.reverse());
		// System.out.println(sb);
		 
		System.out.println( sb.charAt(5)); // it print character of 5th index
		System.out.println(sb.codePointAt(5));// it print ascii value of 5th index
		//System.out.println(sb.replace(2, 4, profession));// it replace
		System.out.println(sb); 
		System.out.println(sb.indexOf("v"));// it print index value of "v"
		System.out.println(sb.capacity());// calculate capacity of sb
		System.out.println(sb.offsetByCodePoints(5, 20));
	}
	private void StringBufferMethod2() {
		
		
		//String thought = "Life is like a box of chocolates. You never know what you're gonna get.";
		 
		StringBuffer sb2 = new StringBuffer("Life is like a box of chocolates. You never know what you're gonna get.");
		System.out.println(sb2);
	}

}
