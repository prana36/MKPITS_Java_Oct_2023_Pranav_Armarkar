package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterClass {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.print("Hello Gunjan");
		pw.close();
		
		
		PrintWriter pw1 = new PrintWriter(new FileWriter("N:\\PRANAV_DATA.txt", true), true);
		pw1.println("File Edited");
		pw1.close();
	}

}
