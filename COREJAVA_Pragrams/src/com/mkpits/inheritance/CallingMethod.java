package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallingMethod {

	public static void main(String[] args) throws IOException {
		SubData sd = new SubData();
		
		sd.getfName();
		sd.getlName();
		sd.getemail();
		sd.getMobile();
		sd.getGender();
		sd.getPinCode();
		
		sd.getDetails();
	}

}
