package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShriDrFaculty extends ShriHospital {
	
	String pSymtoms,cSymtoms,oSymtoms,nSymtoms;
	
	
	void primary() throws IOException {
		System.out.println("Dr. ShriKant Tambaskar Here........");
		System.out.println("Please Enter your Symtoms");
		pSymtoms=br.readLine();
		this.pSymtoms=pSymtoms;
	}
	
	void cardioLogy() throws IOException {
		
		System.out.println("Dr. Pranav A. Armarkar Here........");
		System.out.println("Please Enter your Symtoms");
		cSymtoms = br.readLine();
		this.cSymtoms=cSymtoms;
	}
    
	void ourthopedic() throws IOException {
		System.out.println("Dr. Ashik H. Tembhare Here........");
		System.out.println("Please Enter your Symtoms");
		oSymtoms = br.readLine();
		this.oSymtoms=oSymtoms;
		
	}
	void neurology() throws IOException {
		System.out.println("Dr. Harsh Gupta Here........");
		System.out.println("Please Enter your Symtoms");
		nSymtoms=br.readLine();
		this.nSymtoms=nSymtoms;
	}

}
