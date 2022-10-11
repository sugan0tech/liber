package repository;

import java.sql.*;

public class LiberMainJDBC {
	   static final String DB_URL = "jdbc:mysql://localhost/employees";
	   static final String USER = "sugan";
	   static final String PASS = "1234";

	   public Statement getStatement() throws Exception {
	      Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      Statement stmt = conn.createStatement();
	      return stmt;
	   }
}