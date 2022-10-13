package repository;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class StudentRepository {
	LiberMainJDBC liberMainJDBC ;
	String query;
	Statement statement ;
	ResultSet resultSet;
	public StudentRepository(LiberMainJDBC liberMainJDBC)throws Exception {
		this.liberMainJDBC = liberMainJDBC;
		this.statement = this.liberMainJDBC.getStatement();
	}
	public void addStudent(String rollNo, String isbnValue, String dueDate) {
		try {
			Statement stmt=liberMainJDBC.getStatement();
			query="insert into transaction (roll_no, ISBN, issue_date, due_date )values (\"" + rollNo + "\", \"" + isbnValue + "\",\"" + new SimpleDateFormat("yyyy-MM-dd").format(new Date())+"\",  \"" + dueDate + "\");" ;
			System.out.println(query);
			stmt.executeUpdate(query);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void clear(String rollNo) {
		try {
			Statement stmt=liberMainJDBC.getStatement();
			query="delete from transaction where roll_no='"+rollNo+"'";
			stmt.executeUpdate(query);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public String[] getReturnDate(String rollNo) {
		try {
			Statement stmt=liberMainJDBC.getStatement();
			query="select issue_date,due_date from transaction where roll_no='"+rollNo+"'";
			resultSet=stmt.executeQuery(query);
			resultSet.next();
			String dates[]=new String[2];
			dates[0]=resultSet.getString(1);
			dates[1]=resultSet.getString(2);
			return dates;
		}catch(Exception e) {
			System.out.println(e);
		}
		return new String[2];
	}
	public boolean contains(String rollNo) {
		try {
			query="select * from transaction where roll_no='"+rollNo+"'";
			resultSet = statement.executeQuery(query);
			return resultSet.next();
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;

	}
}

