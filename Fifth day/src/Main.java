import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Calculation calculation = new Calculation();
	
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please enter first number: ");
		int i = userInput.nextInt();
		System.out.println("Please enter second number: ");
		int n = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Which operation would you like to do? 1) + , 2) - , 3) / , 4) * .");
		int p = userInput.nextInt();
	
		int resultA = i + n;
		int resultB = i - n;
		int resultC = i / n;
		int resultD = i * n;
		
		switch (p) {
		case 1:
			System.out.println("The result is: " + resultA); break;
		case 2:
			System.out.println("The result is: " + resultB); break;
		case 3:
			System.out.println("The result is: " + resultC); break;
		case 4:
			System.out.println("The result is: " + resultD); break;
		default: 
			System.out.println("You have to enter a valid number (1,2,3 or 4).");
		}
		
		userInput.nextLine();
		System.out.println("Would you like to play again? Yes / No ");
		String x = userInput.nextLine();
	   
		if (x.equals("Yes"));
	
		else {
			System.out.println("Good bye!");
		}
		
	}

}
