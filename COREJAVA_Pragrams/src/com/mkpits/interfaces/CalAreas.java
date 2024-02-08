package com.mkpits.interfaces;


public class CalAreas implements MethodsToCalAreas {
	float l,h;
	
      


	@Override
	public void getData(float l,float h) {
		this.l=l;
		this.h=h;
		
		
	}


	@Override
	public void areaOfRectangle() {
		
		float area=l*h;
		System.out.println("Area Of rectangle is "+area);
		
	}

	@Override
	public void areaOfTriangle() {
		float area=l*h/2;
		System.out.println("Area Of triangle is "+area);		
	}

	
}
