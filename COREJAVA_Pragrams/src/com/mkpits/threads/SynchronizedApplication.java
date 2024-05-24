package com.mkpits.threads;

public class SynchronizedApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizationTable table = new SynchronizationTable();
		
		Thread1 t1 = new Thread1(table);
		Thread2 t2 = new Thread2(table);
		t1.start();
		t2.start();
		

	}

}
