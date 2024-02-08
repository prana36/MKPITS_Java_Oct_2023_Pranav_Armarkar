package com.mkpits.interfaces;

public class MitsubishiCar implements CarMain {

	@Override
	public void carBrand() {
		System.out.println("Brand Of Car is Mitsubishi (Sport version)");
		
	}

	@Override
	public void carColour() {
		System.out.println("Black");
		
	}

	@Override
	public void carPorperties() {
		System.out.println("AMT \n Manual Trasmission ");
		System.out.println("Sun Roof ");
		System.out.println("2000cc");
		
	}

}
