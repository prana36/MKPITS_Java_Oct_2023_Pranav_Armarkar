package com.mkpits.filehandling;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) 
	{
		
		File f = new File("C:\\mkpits_workspace\\MKPITS_Java_Oct_2023_Pranav_Armarkar");
		
		String [] str = f.list();
		
		for (int i = 0; i < str.length; i++) 
		{
			File f1 = new File(f,str[i]);
			
			if (f1.isDirectory()) 
			{
				System.out.println(f1.getName()+" is Directory");
				
			} else if(f1.isFile())
			 {
				System.out.println(f1.getName()+" is File");

			 }
			
		}

	}

}
