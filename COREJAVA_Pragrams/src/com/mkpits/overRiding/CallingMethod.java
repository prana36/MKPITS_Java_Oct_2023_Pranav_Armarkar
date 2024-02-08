package com.mkpits.overRiding;

public class CallingMethod {

	public static void main(String[] args) {
		SuperData obj;
		
         obj=new SuperData();
         obj.data(10.5f, 20.6f);//Value pass to SuperData  
         obj.area();// calling constructor reference of SuperData
         
         obj=new TrangleData();
         obj.data(20.3f, 10.3f);//Value pass to SuperData 
         obj.area(); // calling constructor reference of TrangleData
         
         
	}

}
