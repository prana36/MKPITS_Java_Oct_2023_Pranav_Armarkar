package com.mkpits.threads;

import java.util.Iterator;

public class SynchronizationTable 
{
	 public void printTable(int n) {
	synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n*i);
				
			}
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}

}
