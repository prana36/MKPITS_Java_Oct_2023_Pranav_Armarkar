package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		String allData= br1.readLine();
		
		FileWriter fw = new FileWriter("N:\\FileWriterClass1",true);
		fw.write(allData);
		fw.close();
		System.out.println("Data Is Inserted");
		//fw.flush();--> it is use to clear all the data in file

	}

}
