package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
		String user = "root";
		String password = "";
		
		Connection connection = null;
		Statement statement  = null;
		
		
		try {
			//create a connection
			
			 connection = DriverManager.getConnection(url, user, password);
			
			 //create a statement
			 
			statement = connection.createStatement();
			
			//execute the sql query
			
			String query = "insert into movie(id, title, release_year, genre, Mpaa rating)" +
			
			                "value (4,'Bader Meye Josna', 1980, 'Drama', 'PG')";
			
			statement.execute(query);
			
			//process result set (if necessary)
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			statement.close();
			connection.close();
		}
		
		
	}
}
