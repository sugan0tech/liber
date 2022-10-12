package repository;
import java.sql.*;

public class StudentRepository {
	public void clear(String roll_no) {
		try {
			LiberMainJDBC lib=new LiberMainJDBC();
			Statement stmt=lib.getStatement();
			String sql="delete from transaction where roll_no='"+roll_no+"'";
			stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public String[] getReturnDate(String roll_no) {
		try {
			LiberMainJDBC lib=new LiberMainJDBC();
			Statement stmt=lib.getStatement();
			String sql="select issue_date,due_date from transaction where roll_no='"+roll_no+"'";
			ResultSet rs=stmt.executeQuery(sql);
			rs.next();
			String dates[]=new String[2];
			dates[0]=rs.getString(1);
			dates[1]=rs.getString(2);
			return dates;
		}catch(Exception e) {
			System.out.println(e);
		}
		return new String[2];
	}
}

