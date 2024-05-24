package com.mkpits.threads;

public class Notifier implements Runnable 
{
	private Message msg;

	public Notifier(Message msg) {
		
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"Started");
		try {
			Thread.sleep(5000);
			synchronized (msg) {
				msg.setMsg(name+"work Done");
				// msg.
				msg.notifyAll();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	 

}
