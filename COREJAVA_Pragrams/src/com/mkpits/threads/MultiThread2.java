package com.mkpits.threads;

public class MultiThread2 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}


			for (int i = 0; i <= 5; i++) {
				System.out.println("++++++" + i);
			}

	
	}

}
