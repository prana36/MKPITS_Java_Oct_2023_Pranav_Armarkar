package com.mkpits.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SnakeGame {

	String systemInput;
	
	public static void main(String[] args) throws IOException  {
		
		SnakeGame sg=new SnakeGame();
		sg.snake();
		
	}
	public void snake() throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome To snake Game");
		char ch = 'y';
		while (ch=='y'||ch=='Y')
		{
			int random = (int)Math.ceil(Math.random()*100);
			System.out.println("The Random No. "+random);
			
			if (random>=0 && random<33) {
				 systemInput = "s";
				
			}
			if (random>33 && random<66) {
				systemInput = "w";
				
			}
			if (random > 66 && random <= 100) {
				systemInput = "g";
				
			}
			
		
		System.out.println(systemInput);
		System.out.println("Enter Your Choice \n1.S\n2.W\n3.G");
		String userInput = br.readLine();
		if ((systemInput.equalsIgnoreCase("S") && userInput.equalsIgnoreCase("W")) ||
				(systemInput.equalsIgnoreCase("W") && userInput.equalsIgnoreCase("S"))) {
			
				System.out.println("Snake Win");
		}
		
		if ((systemInput.equalsIgnoreCase("W") && userInput.equalsIgnoreCase("G")) ||
				(systemInput.equalsIgnoreCase("G") && userInput.equalsIgnoreCase("W"))) {
			
				System.out.println("Water Win");
		}
		
		if ((systemInput.equalsIgnoreCase("S") && userInput.equalsIgnoreCase("G")) ||
				(systemInput.equalsIgnoreCase("G") && userInput.equalsIgnoreCase("S"))) {
			
				System.out.println("Gun Win");
		}
		
		System.out.println("Do you wish to Continue Y/N");
		ch = (char) br.read();
		br.readLine();
	}

	}

}
