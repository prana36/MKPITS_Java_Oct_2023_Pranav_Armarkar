package com.mkpits.books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class BooksDbUtil 
{
	private DataSource dataSource;

	public BooksDbUtil(DataSource dataSource) {

		this.dataSource = dataSource;
	}

	public List<BooksModel> getbooks() {
		List<BooksModel> BooksModels = new ArrayList<BooksModel>();
		Connection myConn = null; //Connection (interface) is use for add connection resource 
		Statement myStmt = null; //statement (interface) is use for showing and  fetching data
		ResultSet myRs = null;  //ResultSet (interface) is use for showing data
		try {
			myConn = dataSource.getConnection();

			// Create a sql statment
			String sql = "select * from books order by id";
			myStmt = myConn.createStatement();

			// execute sql query
			myRs = myStmt.executeQuery(sql);

			// process the result set
			while (myRs.next()) {
				int id = myRs.getInt("id");
				String title = myRs.getString("title");
				String author = myRs.getString("author");
				String date = myRs.getString("date");
				String genres = myRs.getString("genres");
				String characters = myRs.getString("characters");
				String synopsis = myRs.getString("synopsis");
				

				// Create new Student_Model object
				BooksModel tempBook = new BooksModel(id,title,author,date,genres,characters,synopsis);

				// add it to the list of student
				BooksModels.add(tempBook);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			close(myConn, myStmt, myRs);
		}
		return BooksModels;
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
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

	public void addBooks(BooksModel theBooks) {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			//get db connection
			myConn = dataSource.getConnection();
			
			//create sql for insert
			String sql = "insert into student(title,author,date,genres,characters,synopsis) values(?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(sql); // preparestatment (interface) is use for updating , inserting data
			
			//set the param values for the student
			myStmt.setString(1, theBooks.getTitle());
			myStmt.setString(2, theBooks.getAuthor());
			myStmt.setString(3, theBooks.getDate());
			myStmt.setString(4, theBooks.getGenres());
			myStmt.setString(5, theBooks.getCharacters());
			myStmt.setString(6, theBooks.getSynopsis());
			
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
		

