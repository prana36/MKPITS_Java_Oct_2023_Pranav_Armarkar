package com.mkpits.enums;

public class CallingEnum {

	public static void main(String[] args) {
		for (EnumUse1 st : EnumUse1.values() ) 
		{
			System.out.println(st);
			
		}
		for (EnumUse2 ot : EnumUse2.values())
		{
			System.out.println(ot+" "+ot.output);
		}
	}

}
