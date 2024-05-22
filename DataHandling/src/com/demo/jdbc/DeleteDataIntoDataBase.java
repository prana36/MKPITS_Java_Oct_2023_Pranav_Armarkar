package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDataIntoDataBase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_books","root","");
            PreparedStatement preStmt = conn.prepareStatement("Delete from login  Where id=?");
            
             preStmt.setInt(1, 5); 
              
            int i=preStmt.executeUpdate();  
            System.err.println(i+" record is deleted"); 
            preStmt.close();
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from login");
            
            while (rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            }
				stmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
