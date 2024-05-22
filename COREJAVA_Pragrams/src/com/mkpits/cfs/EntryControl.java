package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class EntryControl 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int []arry = {1,3,4,5,6,5};
		
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
			
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int petrolPrice1 = 0;
		petrolPrice1 = Integer.parseInt(br.readLine());
		while (petrolPrice1>20) {
			petrolPrice1 = Integer.parseInt(br.readLine());
			if (petrolPrice1>20) {
				System.out.println("petrol Price Is "+petrolPrice1);
				break;
				
			}else {
				System.out.println("Enter Vailed Price ");
			}
			continue;
			
		}
		
	}

}
