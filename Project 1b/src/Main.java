import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String again;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Choose a shape: circle, triangle or rectangle.");
			String userChoice = scanner.nextLine();

			switch (userChoice) {
			case "circle":
				System.out.println("Input radius.");
				double radius = scanner.nextDouble();
				scanner.nextLine();
				Circle circle = new Circle(radius);
				System.out.println("Do you want to calculate area, circumference or both?");
				String choice = scanner.nextLine();
				circle.switchCircle(choice);
				break;
			case "triangle":
				System.out.println("Input base.");
				double base = scanner.nextDouble();
				System.out.println("Input height.");
				double height = scanner.nextDouble();
				scanner.nextLine();
				Triangle triangle = new Triangle(base, height);
				System.out.println("Do you want to calculate area, circumference or both?");
				choice = scanner.nextLine();
				triangle.switchTriangle(choice);
				break;
			case "rectangle":
				System.out.println("Input height.");
				double rectangleHeight = scanner.nextDouble();
				System.out.println("Input length.");
				double rectangleLength = scanner.nextDouble();
				scanner.nextLine();
				Rectangle rectangle = new Rectangle(rectangleHeight, rectangleLength);
				System.out.println("Do you want to calculate area, circumference or both?");
				choice = scanner.nextLine();
				rectangle.switchRectangle(choice);
				break;
			}
			
			System.out.println("Would you like to go again?");
			
			again = scanner.nextLine();
		} while (again.equalsIgnoreCase("yes"));
		
		System.out.println("Goodbye!");
	}
}
