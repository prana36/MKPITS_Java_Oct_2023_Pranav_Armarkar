package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseCfs {

	static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome To Hotel Prnoosz...");
		System.out.println("Starter:- 1.Tandoori Paneer Tikka 2.Malai Paneer Tikka");
		System.out.println("Main Course:- 1.Saoji Mutton 500 2. Saoji Chiken 300");
		System.out.println("Drinks:- 1.All Beers 2. Wiskey ");
		System.out.println("Sweets:- 1.Motichur 2. Rusmalai");
		System.out.println("Sneaks:- 1.Samosa 2. Tari Poha");
				

		SwitchCaseCfs obj = new SwitchCaseCfs();
		 br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Hotel :-  \n1.Starter \n2.Main Course \n3.Drinks \n4.Sweets \n5.Snaeks");
		int hotel = Integer.parseInt(br.readLine());
		switch (hotel) {
		case 1:
			obj.starter();
			break;
		case 2:
			obj.mainCourse();
			break;
			
			
		case 3:
			obj.drinks();

			break;
			
			
			
		case 4:
			obj.sweets();

			break;
			
			
		case 5:
			obj.sneaks();
            
			break;
			
			
			

		default:
			break;
		}

	}
	private void starter() throws IOException {
		System.out.println("Enter Starter items :- ");
		String items=br.readLine();
		System.out.println("Order Placed ");
		
	}

	private void mainCourse() throws IOException {
		System.out.println("Enter Main Course :- ");
		String mainCourse=br.readLine();
		System.out.println("Order Placed ");
		
	}
	private void drinks() throws IOException {
		System.out.println("Enter Drinks :- ");
		String drinks=br.readLine();
		System.out.println("Order Placed ");
		
		
	}
	private void sweets() throws IOException {
		System.out.println("Enter Sweets :- ");
		String sweets=br.readLine();
		System.out.println("Order Placed ");
		
		
	}
	private void sneaks() throws IOException {
		System.out.println("Enter Sneaks :- ");
		String sneaks=br.readLine();
		System.out.println("Order Placed ");
		
		
	}
	

	

	

	
}
