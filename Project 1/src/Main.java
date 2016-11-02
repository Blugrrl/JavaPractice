import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String again;
		Scanner scanner = new Scanner(System.in);
	do{
		System.out.println("Choose a shape: circle, triangle or rectangle.");
		String userChoice = scanner.nextLine();

		switch (userChoice) {
		case "circle":
			Circle circle = new Circle();
			System.out.println("Input radius.");
			double radius = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Do you want to calculate area, circumference or both?");
			String choice = scanner.nextLine();
			
			switch (choice) {
			case "area":
				System.out.println("The area is " + circle.area(radius));
				break;
			case "circumference":
				System.out.println("The circumference is " + circle.circumference(radius));
				break;
			default:
				System.out.println(
						"Area is " + circle.area(radius) + " and circumference is " + circle.circumference(radius));
				break;
			}
			break;
		case "triangle":
			Triangle triangle = new Triangle();
			System.out.println("Input base.");
			double base = scanner.nextDouble();
			System.out.println("Input height.");
			double height = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Do you want to calculate area, circumference or both?");
			choice = scanner.nextLine();
			
			switch (choice) {
			case "area":
				System.out.println("The area is " + triangle.area(base, height));
				break;
			case "circumference":
				System.out.println("The circumference is " + triangle.circumference(base));
				break;
			default:
				System.out.println("Area is " + triangle.area(base, height) + " and circumference is "
						+ triangle.circumference(base));
				break;
			}
			break;
			
		case "rectangle":
			Rectangle rectangle = new Rectangle();
			System.out.println("Input height.");
			height = scanner.nextDouble();
			System.out.println("Input length.");
			double length = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Do you want to calculate area, circumference or both?");
			choice = scanner.nextLine();
			
			switch (choice) {
			case "area":
				System.out.println("The area is " + rectangle.area(height, length));
				break;
			case "circumference":
				System.out.println("The circumference is " + rectangle.circumference(height, length));
				break;
			default:
				System.out.println("Area is " + rectangle.area(height, length) + " and circumference is "
						+ rectangle.circumference(height, length));
				break;
			}
			break;
			
		}
		System.out.println("Would you like to go again?");
		again = scanner.nextLine();
	}
	while(again.equalsIgnoreCase("yes"));
	System.out.println("Goodbye!");
	}
}
