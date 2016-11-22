
public class Movies {

	private int movieLenght;
	private String movieName;
	private String director;
	
	public Movies(int movieLenght, String movieName, String director) {
		this.movieLenght = movieLenght;
		this.movieName = movieName;
		this.director = director;
	}
	
	public int getMovieLenght() {
		return movieLenght;
	}
	
	public void setMovieLenght(int movieLenght) {
		this.movieLenght = movieLenght;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName() {
		//this.movieName = movieName;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
}
