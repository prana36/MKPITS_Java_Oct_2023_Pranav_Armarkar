package com.mkpits.threads;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Customer c = new Customer();
		new Thread() {
			public void run(){
				c.withdraw(15000);
			}
			
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}

}
