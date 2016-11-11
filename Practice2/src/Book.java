
public class Book {
	
	private int bookLength;
	private String author;
	private String bookName;
	
	public Book (int bookLength, String author, String bookName) {
		this.bookLength = bookLength;
		this.author = author;
		this.bookName = bookName;
	}
	
	public int getBookLength() {
		return bookLength;
	}
	
	public void setBookLenght(int bookLength) {
		this.bookLength = bookLength;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
