package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("N:\\PRANAV_DATA.txt");// to  insert data in file
		
		int b= 0;
		while ((b=fis.read()) != -1) // read byte one by one 
		{
			System.out.print((char)b); // remove char and get o/p
		}
		fis.close();
		
	}

}
