package com.mkpits.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GetInputFromUser {
	//static int petrolPrice;

	public static void main(String[] args) throws NumberFormatException, IOException  {
		GetInputFromUser gifu = new GetInputFromUser();
		gifu.getRate();
		
		
		

	}

	public void getRate() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter petrol price  ");
		int petrolPrice= Integer.parseInt(br.readLine());
	}

}