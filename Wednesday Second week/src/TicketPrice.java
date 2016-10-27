
public class TicketPrice {

	public static void main(String[] args) {
		
		int ticketPrice = 25;
		int discountedPrice = 5;
		int age= 9;
		boolean isStudent= true;
		
		if (isStudent || age > 65 || age <= 15) {
			
			System.out.println("The price is: " + discountedPrice + "$");
			
		}
		else {
			System.out.println("The price is: " + ticketPrice + "$");
		}

	}

}
