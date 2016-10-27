
public class NewMain {

	public static void main(String[] args) {
	
	Customer simonManager = new Customer("Mr", "Simon", "Says");
	Customer johnManager = new Customer("Mr", "John" , "Smith");
	
//	simonManager.setName("Mr", "Simon", "Says");
//	johnManager.setName("Mr", "John" , "Smith");
	System.out.println(simonManager.getFirstName());
	System.out.println(johnManager.getSurname());
	System.out.println(simonManager.getMailingName());
	
	}

}
