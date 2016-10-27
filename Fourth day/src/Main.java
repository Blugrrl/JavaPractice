
public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "Introduction to the basic Java", "John Isaacs", "12345");
		Book book2 = new Book(2, "Advanced Java", "Isabella Doe", "54321");
		Book book3 = new Book(3,"bla bla", "John doe", "3423232");
		UI ui = new UI(); 
			
			ui.printHeader();
			ui.printBook(book1);
			ui.printBook(book2);
			ui.printBook(book3);
		
	}

}
