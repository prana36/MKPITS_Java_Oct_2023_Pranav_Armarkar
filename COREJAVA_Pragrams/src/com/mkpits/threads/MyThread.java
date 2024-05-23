package com.mkpits.threads;

public class MyThread extends Thread 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int index = 0; index <= 5; index++) {
			System.out.println("=========" +index+ "++++++++");
			
		}
	}
}
