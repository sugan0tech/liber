package repository;

import java.sql.*;

public class LiberMainJDBC {
	   private final String DB_URL = "jdbc:mysql://localhost/LiberMain";
	   private final String USER = "sugan";
	   private final String PASS = "1234";

	   public Statement getStatement() throws Exception {
	      Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      Statement stmt = conn.createStatement();
	      return stmt;
	   }
}