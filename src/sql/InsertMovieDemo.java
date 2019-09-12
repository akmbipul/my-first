package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertMovieDemo {

	public static void main(String[] args) throws SQLException {

		//declare variable
		String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
		String user = "root";
		String password = "";

		// create object variable
		Connection connection = null;
		Statement statement = null;

		//Create Movie name object
		Movie titanic = new Movie(5, "Tatanic", 1997, "Romance", "PG-13");

		Movie grudge = new Movie(6, "Grudge", 2003, "Horror", "PG-13");

		Movie inception = new Movie(7, "Inception", 2010, "Thriller", "PG-13");

		ArrayList<Movie> movie = new ArrayList<>();

		movie.add(titanic);
		movie.add(grudge);
		movie.add(inception);

		try {
			// create a connection

			connection = DriverManager.getConnection(url, user, password);

			// create a statement

			statement = connection.createStatement();

			//for loop to insert movies
			for (Movie mv : movie) {

				String query = "insert into movie(id, title, release_year, genre, Mpaa rating)" +

						"value (" + mv.getId() + ",'" + mv.getTitle() + "'," + mv.getReleseYear() + ",'" + mv.getGenre()

						+ "','" + mv.getMpaarating() + "')";

				statement.execute(query);
			}

		} catch (Exception e) {
			
			e.printStackTrace();
		
		} finally {

			statement.close();
			connection.close();
		}

	}
}
