package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtility {
	private DataSource dataSource;

	public StudentDbUtility(DataSource dataSource) {

		this.dataSource = dataSource;
	}

	public List<Student_Model> getStudents() {
		List<Student_Model> student_Models = new ArrayList<Student_Model>();
		Connection myConn = null; //Connection (interface) is use for add connection resource 
		Statement myStmt = null; //statement (interface) is use for showing and  fetching data
		ResultSet myRs = null;  //ResultSet (interface) is use for showing data
		try {
			myConn = dataSource.getConnection();

			// Create a sql statment
			String sql = "select * from student order by id";
			myStmt = myConn.createStatement();

			// execute sql query
			myRs = myStmt.executeQuery(sql);

			// process the result set
			while (myRs.next()) {
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				

				// Create new Student_Model object
				Student_Model tempStudent = new Student_Model(id, firstName, lastName, email);

				// add it to the list of student
				student_Models.add(tempStudent);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			close(myConn, myStmt, myRs);
		}
		return student_Models;
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void addStudent(Student_Model theStudent) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			//get db connection
			myConn = dataSource.getConnection();
			
			//create sql for insert
			String sql = "insert into student(first_name,last_name,email) values(?,?,?)";
			myStmt = myConn.prepareStatement(sql); // preparestatment (interface) is use for updating , inserting data
			
			//set the param values for the student
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			
			//execute SQL insert
			myStmt.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(myConn, myStmt, null);
		}

		
	}
}
