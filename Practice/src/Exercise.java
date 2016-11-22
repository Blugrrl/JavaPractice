import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		
		double result;
		int a;
		double d;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		a = userInput.nextInt();
		System.out.println("Please enter second (decimal) number: ");
		d = userInput.nextDouble();
		
		result = a + d;
		
		System.out.println("The result is: " + result);
		userInput.close();
	}

}
