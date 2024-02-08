package com.mkpits.math;

public class MathDemo {

	public static void main(String[] args) {
		MathDemo md = new MathDemo();
		md.demoOfMath();
	}

	public void demoOfMath() {
		
		System.out.println(Math.cbrt(4));
		System.out.println(Math.abs(23));
		System.out.println(Math.addExact(4, 5));
		System.out.println(Math.ceil(2.3459));
		System.out.println(Math.subtractExact(5, 3));
		System.out.println(Math.floorDiv(24, 4));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.multiplyExact(3, 4));
		System.out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println(Math.decrementExact(3));
		System.out.println(Math.incrementExact(4));
		System.out.println(Math.floorMod(4, 5));
		System.out.println(Math.exp(22.32));
		System.out.println(Math.max(4, 7));
		System.out.println(Math.min(5, 8));
		System.out.println("");
		
		}

}
