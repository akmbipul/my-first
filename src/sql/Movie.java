package sql;

public class Movie {

		
		private int id;
		private String title;
		private int releseYear;
		private String genre;
		private String mpaarating;
		
		
		public Movie(int id, String title, int releseYear, String genre, String mpaarating) {
			super();
			this.id = id;
			this.title = title;
			this.releseYear = releseYear;
			this.genre = genre;
			this.mpaarating = mpaarating;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public int getReleseYear() {
			return releseYear;
		}
		
		public void setReleseYear(int releseYear) {
			this.releseYear = releseYear;
		}
		
		public String getGenre() {
			return genre;
		}
		
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		public String getMpaarating() {
			return mpaarating;
		}
		
		public void setMpaarating(String mpaarating) {
			this.mpaarating = mpaarating;
		}
		
		
}
