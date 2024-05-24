package com.mkpits.threads;

public class MyWorkerThread extends Thread
{

	String task;

	public MyWorkerThread(String task) {
		
		this.task = task;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"(start) task = "+task);
		Processtask();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	private void Processtask() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
}
