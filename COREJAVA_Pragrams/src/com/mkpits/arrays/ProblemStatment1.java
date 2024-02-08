package com.mkpits.arrays;

public class ProblemStatment1 {

	public static void main(String[] args) {
		
		int [] array1 =  {1,2,3,4,5};
		int [] array2 = {10,2,5,3,6,9};
//		for (int i : array1) {
//			System.out.println(i);
//			
//		}
//		for (int i : array2) {
//			System.out.println(i);
//			
//		}
		
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = 0; j < array2.length; j++) {
				if (array1[i]==array2[j]) 
				{
					System.out.println("Similar Elements is  "+array1[i]+" Element of Index is "+j);
				}
				
			}
			
		}
	}

}
