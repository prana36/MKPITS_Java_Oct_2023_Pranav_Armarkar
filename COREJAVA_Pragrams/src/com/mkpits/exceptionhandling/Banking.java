package com.mkpits.exceptionhandling;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Banking {
	static int bal;
	static int amt;
	static int c;
	static BufferedReader br;

	void deposit() {
		System.out.println("Enter Deposit Amount");
		try {
			this.amt = Integer.parseInt(br.readLine());
			System.out.println("Amount Deposited");
		} catch (Exception e) {

			e.printStackTrace();
		}
		bal += this.amt;
	}

	void withdraw() throws LessBalanceException {

		System.out.println("Enter Withdraw Amount");
		try {
			this.amt = Integer.parseInt(br.readLine());
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (bal - this.amt < 500) {
			throw new LessBalanceException(bal);
		} else {
			bal -= this.amt;
		}
	}

	int getBalance() {
		return bal;
	}

	public static void main(String arg[]) {
		Banking b = new Banking();

		try {

			char ch = 'y';
			while (ch == 'y' || ch == 'Y') {

				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("1.Deposit\n2.Withdrawl\n3.Check Balance\nEnter your choice \nchoice=");
				c = Integer.parseInt(br.readLine());
				switch (c) {
				case 1:

					b.deposit();
					System.out.println("Your Balance is " + bal);
					break;
				case 2:

					b.withdraw();
					System.out.println("Your Balance is " + bal);
					break;
				case 3:

					System.out.println("Your Account Balance is " + bal);
					break;
				default:
					System.out.println("Invalid choice");
				}
				System.out.println("Do you wish to continue?Y/N");
				ch = (char) br.read();
				br.readLine();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
