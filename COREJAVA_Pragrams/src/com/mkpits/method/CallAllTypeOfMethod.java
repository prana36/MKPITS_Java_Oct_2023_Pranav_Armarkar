package com.mkpits.method;
import com.mkpits.datatype.*;

public class CallAllTypeOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithReturnTypeAndArgument data1 = new MethodWithReturnTypeAndArgument();
		MethodWithArgumentAndNoReturnType data2 = new MethodWithArgumentAndNoReturnType();
		StaticMethodDeclaration data3 = new StaticMethodDeclaration();
		NonStaticMethodWithReturnType data4 = new NonStaticMethodWithReturnType();
		//Demo.getName();
		
		System.out.println("******************************************************************************");
		System.out.println("data3");
		data3.getallData();
		System.out.println("******************************************************************************");
		System.out.println("data4");
		data4.main(args);
		System.out.println("******************************************************************************");
		System.out.println("data1");
		data1.main(args);
		System.out.println("******************************************************************************");
		System.out.println("data2");
		data2.main(args);
        
	}
	

}
