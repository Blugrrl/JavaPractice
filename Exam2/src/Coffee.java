import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which drink would you like?");
		int x = sc.nextInt();
		
		switch (x) {
		
		case 1: System.out.println("Black coffee"); break;
		case 2: System.out.println("Hot chocolate"); break;
		case 3: System.out.println("Cappuccino"); break;
		case 4: System.out.println("Latte"); break;
		case 5: System.out.println("Tea"); break;
		default: System.out.println("No drink for you!");
		}

	}

}
