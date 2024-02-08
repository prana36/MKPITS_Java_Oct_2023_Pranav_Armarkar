package com.mkpits.overRiding;

public class SuperData 
{
  float length,height ;
  
  
  void data(float length , float height) 
  {
	  this.length=length;
		this.height=height;
	  
  }
	
	void area()
	{
		float area= length*height  ;
		 System.out.println("Length is:- "+length+"\nheight is "+height+"\nArea of Reactangle is :- " +area);
		
	}
	
}
