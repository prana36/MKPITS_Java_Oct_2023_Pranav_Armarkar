package com.mkpits.threads;

public class Thread2 extends Thread{
	SynchronizationTable t;

	public Thread2(SynchronizationTable t) {
		
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(10);
	}
	

}
