
public class Main {

	public static void main(String[] args) {
		
		Movies movie1 = new Movies(120, "Nameless movie", "Mr. Director");
		
		System.out.println("The movie name is " + movie1.getMovieName() 
		+ ". The length of the movie is " + movie1.getMovieLenght() 
		+ " minutes. It was directed by " + movie1.getDirector() + ".");

		Book book1 = new Book(350, "Booky mcBook", "TheBook!");
		
		System.out.println("The book length is " + book1.getBookLength() + " pages. The name of the book is " 
		+ book1.getBookName() + ". The author is " + book1.getAuthor() + ".");
	}

}
