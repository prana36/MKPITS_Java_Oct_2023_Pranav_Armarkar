package com.mkpits.lambda;
  
import java.util.ArrayList;
  
public class ImplementLambdaEx {

	public static void main(String[] args) {

		// Create object of array list
		ArrayList<Integer> list = new ArrayList<Integer>();
		// adding elements
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(11);
		list.add(16);
		// implement lambda expression
		// print all elements of list
		list.forEach(n -> System.out.println(n));
		System.out.println("Print the even numbers from the list : ");
		list.forEach(x -> {
            if (x % 2 == 0)
                System.out.println(x);
        });
	}

}
