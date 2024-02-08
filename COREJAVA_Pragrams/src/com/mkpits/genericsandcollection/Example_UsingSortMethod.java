package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example_UsingSortMethod 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(11);
		list.add(49);
		list.add(-69);
		list.add(69);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list , Collections.reverseOrder());
		System.out.println(list );
		
	}

}
