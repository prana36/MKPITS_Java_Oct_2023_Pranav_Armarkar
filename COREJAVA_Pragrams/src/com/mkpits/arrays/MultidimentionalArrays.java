package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//multidimentional array 
// array which contain no. rows and coloums like matrix is called as multidimentional array
//

public class MultidimentionalArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int row ;
		int coll;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("rows:- "); //printing massage
		row = Integer.parseInt(br.readLine()); // read and add rows value 
		System.out.print("collum:- "); //printing massage
		coll = Integer.parseInt(br.readLine());//// read and add coll value 
		
		
		System.out.println("Enter matrix Elements:- ");
	//	int rowColl= Integer.parseInt(br.readLine());
		
		int matrix[][]= new int[row][coll];
		
		
		for (int i = 0; i < row; i++) {
			
			
			for (int j = 0; j < coll; j++) {
				matrix[i][j]=Integer.parseInt(br.readLine());// read and add value of matrix
				
			}
			
		}
		
		System.out.println("The values are ");

		for (int i = 0; i < row; i++) {
			
			
			for (int j = 0; j < coll; j++) {
				
				System.out.print( matrix[i][j]+" ");
				
			}
			System.out.println();
			
		}
	}

}
