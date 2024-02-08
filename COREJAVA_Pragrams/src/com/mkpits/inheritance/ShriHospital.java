package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShriHospital {
	String name,age,adress,mob;
	int bp,sugar;
	String blood;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void getRegistration() throws IOException{
		System.out.println("Welcome To Shri Hospital ");
		System.out.println("Please Fill The Hospital Form First ");
		System.out.println("Enter Name:- ");
		while (true) {
			name=br.readLine();
			if (name.isEmpty()) {
				System.out.println("Name is mandatory please Enter Name");
				continue;
			}
			break;
		}
		
		this.name=name;
		System.out.println("Enter Age:- ");
		
		while (true) {
			age=br.readLine();
			if (age.isEmpty()) {
				System.out.println("Age is mandatory please Enter Age ");
				continue;
			}
			break;
		}
		this.age=age;
		System.out.println("Enter Adress:-  ");
		
		while (true) {
			adress=br.readLine();
			if (adress.isEmpty()) {
				System.out.println("Adress is mandatory please Enter Adress ");
				continue;
			}
			break;
		}
		this.adress=adress;
		
		System.out.println("Enter Mobile:- ");
        
        while (true) {
        	mob=br.readLine();
			if (mob.isEmpty()) {
				System.out.println("Mobile no. is mandatory please Enter Mobile No. ");
				continue;
			}
			break;
		}
		this.mob=mob;
        System.out.println("Enter Blood Group:- ");
		blood=br.readLine();
		this.blood=blood;
		
		
	}
	void checkup() throws IOException {
		System.out.println("Welcome to Checkup ");
		
		System.out.println("Test BP :- ");
		bp = (int)Math.ceil(Math.random()*1000);
		System.out.println("bp is "+bp);
		this.bp=bp;
		
		System.out.println("Test Sugar:- ");
		sugar=(int)Math.ceil(Math.random()*1000);
		System.out.println("Sugar is "+sugar);
		this.sugar=sugar;
	}
	 
}
