package com.mkpits.threads;

public class Thread1 extends Thread{
	SynchronizationTable t;

	public Thread1(SynchronizationTable t) {
		
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(5);
	}
	

}
