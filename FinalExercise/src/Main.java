import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculation calculation = new Calculation(); //create object to call to other class
		
		int userOperation; //the only int that is not stored in second Class
		String goAgain;
		
		Scanner userInput = new Scanner(System.in); //scanner 
		
		do {
			
			System.out.println("Please enter first number: ");
			calculation.firstNumber = userInput.nextDouble(); //to use ints / doubles from second class, we have to call upon the object before
		
			System.out.println("Please enter second number: ");
			calculation.secondNumber = userInput.nextDouble();
		
			System.out.println("Please choose which operation: 1) + , 2) - , 3) * , 4) / ");
			userOperation = (int) userInput.nextDouble();
		
			switch (userOperation) {
			case 1: calculation.add(); break;
			case 2: calculation.substract(); break;
			case 3: calculation.multiply(); break;
			case 4: calculation.divide(); break;
			default: System.out.println("You have to enter a valid number (1,2,3 or 4).");
			}
		
		System.out.println("Would you like to go again? yes / no ");
		goAgain = userInput.next();
		
		}
		while (goAgain.equalsIgnoreCase("yes"));
		System.out.println();
		
	}

}
