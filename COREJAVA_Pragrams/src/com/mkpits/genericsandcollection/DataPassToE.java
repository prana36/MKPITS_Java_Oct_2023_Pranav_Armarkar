package com.mkpits.genericsandcollection;

public class DataPassToE {

	public static void main(String[] args) {
		Integer []intData = {1,3,2,4,6,3,6,9};
		PrintArray<Integer> it = new PrintArray();
		it.print(intData);
		
		
		String [] strData = {"car","bike","Truck","Auto","Scooty"};
		PrintArray<String> str = new PrintArray<String>();
		str.print(strData);

	}

}
