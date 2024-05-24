package com.mkpits.threads;

public class MultiThreadApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread1 mt1 = new MultiThread1();
		mt1.start();
		try {
			mt1.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		MultiThread1 mt3 = new MultiThread1();
		mt3.start();
		
		
		
//		MultiThread2 mt2 = new MultiThread2();
//		mt2.start();

	}

}
