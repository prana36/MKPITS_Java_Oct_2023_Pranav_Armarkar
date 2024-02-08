package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutStreamDemo {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data To be Write ");
		String str = br.readLine();// to get data 
		
		
		
		str=str+ "\n"; //

		// to creat file in N drive  
		//
		FileOutputStream fos = new FileOutputStream("N:\\PRANAV_DATA.txt",true);
        byte b[] = str.getBytes();//
        fos.write(b); //to insert data form byte array ie. b[] 
		fos.close();// to close the file
		System.out.println("Data is Written");
	}

}
