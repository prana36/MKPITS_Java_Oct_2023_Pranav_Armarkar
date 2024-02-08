package com.mkpits.genericsandcollection;

import java.util.ArrayList;

public class PrintBothData {

	public static void main(String[] args) {
		
		Integer []intData = {1,3,2,4,6,3,6,9}; 
		PrintIntegerArray PIA = new PrintIntegerArray();
		PIA.print(intData);
		
		String [] strData = {"car","bike","Truck","Auto","Scooty"};
		PrintStringArray PSA = new PrintStringArray();
		PSA.print(strData);
		
	}

}
