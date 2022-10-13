package repository;
import java.sql.*;

public class BookRepository {
	LiberMainJDBC liber = new LiberMainJDBC();
	public void addBook(String ISBN, String name, String author, String publishedYear, String stock) {
		try {
			Statement stmt = liber.getStatement();
			String query = "insert into book values( '" + ISBN + "','" + name + "','" + publishedYear + "','" + author + "','" + stock +"')";
		    int status = stmt.executeUpdate(query);
		    if(status == 1) {
		    	System.out.println("Added Successfully!");
		    }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public String getBookName(String ISBN) {
		try {
			Statement stmt = liber.getStatement();
			String query = "select title from book where ISBN = '" + ISBN +"'";
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			return rs.getString(1);
		} catch(Exception e) {
			System.out.println(e);
		}
			return "";
	}
	public void updateStock(String ISBN, String stock) {
		try {
			Statement stmt = liber.getStatement();
			int newStock = Integer.parseInt(stock);
			String query = "update book set stock = stock + '" + newStock + "' where ISBN = '" + ISBN + "'";
			int status = stmt.executeUpdate(query);
			if(status == 1) {
				System.out.println("Stock Updated Successfully!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void issueBook(String ISBN) {
		try {
			Statement stmt = liber.getStatement();
			String query = "update book set stock = stock - 1 where ISBN = '" + ISBN + "'";
			int status = stmt.executeUpdate(query);
			if(status == 1) {
				System.out.println("Stock Updated Successfully!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public boolean checkBook(String ISBN) {
		try {
			Statement stmt = liber.getStatement();
			String query = "select * from book where ISBN = '" + ISBN + "'";
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				return true;
			}
			else 
				return false;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
