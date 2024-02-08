package com.mkpits.vacations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Example4_HashMap {

	public static void main(String[] args) {
		 // creating HashMap object of type <String, String> 
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>(); 
  
        System.out.println("Staff DataBase"); 
  
        // adding key-value pairs to HashMap object 
        lhm.put("CSE", "Subba Rao"); 
        lhm.put("IT", "Maruti"); 
        lhm.put("Civil", "Sundari Devi"); 
  
        // Insertion Order iterating 
        System.out.println( 
            "Insertion Order of LinkedHashMap:"
            + " iterating \n"); 
  
        // getting keySet() into Set 
        Set<String> set = lhm.keySet(); 
  
        // get Iterator from key set 
        Iterator<String> itr = set.iterator(); 
  
        // iterating as per Insertion Order 
        while (itr.hasNext()) { 
            String key = itr.next(); 
            System.out.println("Key : " + key + "\t\t"
                               + "Value : " + lhm.get(key)); 
        } 
  
        // Reverse of Insertion Order iterating 
        System.out.println("\n\nReverse of Insertion Order:"
                           + " iterating \n"); 
  
        // convert to ArrayList of key set 
        List<String> alKeys 
            = new ArrayList<String>(lhm.keySet()); 
  
        // reverse order of keys 
        Collections.reverse(alKeys); 
  
        // iterate LHM using reverse order of keys 
        for (String strKey : alKeys) { 
            System.out.println("Key : " + strKey + "\t\t"
                               + "Value : "
                               + lhm.get(strKey)); 
        } 

	}

}
