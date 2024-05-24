package com.mkpits.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingTableUserDefined {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No. ");
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
//			System.err.print((num*i));
			
		}

	}

}
