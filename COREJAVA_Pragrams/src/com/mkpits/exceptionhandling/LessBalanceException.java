package com.mkpits.exceptionhandling;

public class LessBalanceException extends Exception {

	int amount;

	public LessBalanceException() {
		System.out.println("Default Constructor Called");
	}

	public LessBalanceException(int amount) {
		this.amount = amount;

	}

	@Override
	public String toString() {
		return "You Dont Have Sufficient Balance Your Balance is " + amount;
	}

}