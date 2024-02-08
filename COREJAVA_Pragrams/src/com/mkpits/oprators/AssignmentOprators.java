package com.mkpits.oprators;

public class AssignmentOprators
//2)Assignment operators:-
//== , += , *= ,-= , %=

{
	public static void main(String[] args) 
	{
		
		AssignmentOprators so = new AssignmentOprators();
		so.equal();
		so.add();
		so.sub();

	}

	public void sub() {
		int x=27;
		int y=7;
		System.out.println(x-=y);
		
	}

	public void add() {
		int x=27;
		int y=7;
		int b=x+=y;
		System.out.println(b);
	}

	private void equal() 
	{
		int x = 90;
		int y= 10;
		
		System.out.println(x==y);
	}

}
