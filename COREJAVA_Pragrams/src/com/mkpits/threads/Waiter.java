package com.mkpits.threads;

public class Waiter  implements Runnable{
	
	private Message msg;

	public Waiter(Message msg) {
		
		this.msg = msg;
	}

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		synchronized (msg) {
			try {
				System.out.println("started waiting to get notified at :"+System.currentTimeMillis());
				msg.wait();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(name+"Waiter thread got notified at "+System.currentTimeMillis());
			//Process the Message Now
			System.out.println(name+"processed "+msg.getMsg());
			
		}	
	}

	
}
