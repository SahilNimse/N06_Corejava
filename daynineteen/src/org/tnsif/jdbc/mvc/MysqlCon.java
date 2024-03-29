package org.tnsif.jdbc.mvc;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlCon {

	public static void main(String[] args) {
		try {
			//Load the JDBC driver for Mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
			//establish the connection with database
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
			System.out.println("Connection established successfully....");
			
			//Statement - used for static queries
			Statement st=cn.createStatement();
			//Retrieving data from student table
			ResultSet rs=st.executeQuery("SELECT * FROM emp");
			while(rs.next())
			{
				//fetching single record
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			}
			rs.close();
			
			//Inserting data into student table
			int n=st.executeUpdate("INSERT INTO emp VALUES(6,'Saish',37)");
			if (n==1)
				System.out.println("Record inserted Successfully....");
			else
				System.out.println("Unable to insert record");
			
			//delele students whose name starts with p
			n=st.executeUpdate("DELETE FROM emp WHERE name LIKE 'p%'");
			if (n>=1)
				System.out.println(n+" Record(s) Deleted Successfully....");
			else
				System.out.println("No such record found");
			
			//update student percentage increased by 5
			n=st.executeUpdate("UPDATE emp SET per=per+5 WHERE per<96");
			if (n>=1)
				System.out.println(n+" Record(s) Updated Successfully....");
			else
				System.out.println("No such record found");
			
			//Terminate the connection
			cn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());

		}

	}

}
