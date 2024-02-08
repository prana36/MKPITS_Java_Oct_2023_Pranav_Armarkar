package com.mkpits.method;

public class CallAllMethodMain {

	public static void main(String[] args) {
		
		AllTypeOfMethod atom = new  AllTypeOfMethod();
		System.out.println(atom.getGender());
		 // we can not use System.out.println(atom.getSports()); because in these method we use void keyword and System.out.println()do not void
		atom.getSports();
		System.out.println(atom.getmyWork());
	 atom.getMail();
      StaticMethodDeclaration.getFirstName();
	}

}
