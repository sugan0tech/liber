package repository;

import java.sql.ResultSet;
import java.sql.Statement;


public class LoginRepository {
	public boolean Login(LiberMainJDBC liberMainJDBC, String name, String password){
		try {
		Statement statement = liberMainJDBC.getStatement();
		ResultSet resultSet = statement.executeQuery("select * from librarian where username = \"" + name + "\" and password = \"" + password + "\"") ;
		return resultSet.next();
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
