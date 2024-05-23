package com.mkpits.threads;

public class MyThread2 implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int index = 0; index <= 5; index++) {
			System.out.println("Thread By Runnable Interface=========" +index+ "++++++++");
			
		}
	}
}
