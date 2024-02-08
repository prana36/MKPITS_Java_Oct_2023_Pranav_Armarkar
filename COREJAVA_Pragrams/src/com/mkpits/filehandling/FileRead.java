package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("N:\\FileWriterClass1");
		BufferedReader br = new BufferedReader(fr) ;
		String add = "";
		while ((add = br.readLine()) !=null) {
			System.out.println(add);;	
		}
		fr.close();
	}

}
