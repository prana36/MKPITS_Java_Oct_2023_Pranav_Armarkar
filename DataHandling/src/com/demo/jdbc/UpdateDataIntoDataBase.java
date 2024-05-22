package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDataIntoDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_books","root","");
            PreparedStatement preStmt = conn.prepareStatement("Update login set fullname=?, email=?, passwords=? Where id=?");
            
            
            preStmt.setString(1,"Kaustubh");
            preStmt.setString(2,"kaustubh@gmail.com");
            preStmt.setString(3,"Sonoo@123");//1 specifies the first parameter in the query i.e. name  
            preStmt.setInt(4,4);  
              
            int i=preStmt.executeUpdate();  
            System.out.println(i+" records updated"); 
            preStmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
