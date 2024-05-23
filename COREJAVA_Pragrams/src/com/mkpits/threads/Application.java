package com.mkpits.threads;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread myt = new MyThread();
		myt.start();
		
		MyThread2 run = new MyThread2();
		Thread myt2 =new Thread(run) ;
		myt2.start();
	}

}
