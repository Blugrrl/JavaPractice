import java.util.Scanner;

public class Exercise2b {

	public static void main(String[] args) {
		
		double d;
		double e;
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		d = userInput1.nextInt();
		System.out.println("Please enter second number: ");
		e = userInput1.nextInt();
		
		double result = e + d;
		
		System.out.println("The result is: " + result);

	}

}
