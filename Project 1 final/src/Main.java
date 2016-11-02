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
				double radius = 0;
				Circle circle = new Circle(radius);
				String choice = circle.choiceCircle();
				circle.switchCircle(choice);
				break;
			case "triangle":
				double base = 0;
				double height = 0;
				Triangle triangle = new Triangle(base, height);
				choice = triangle.choiceTriangle();
				triangle.switchTriangle(choice);
				break;
			case "rectangle":
				double rectangleHeight = 0;
				double rectangleLength = 0;
				Rectangle rectangle = new Rectangle(rectangleHeight, rectangleLength);
				choice = rectangle.choiceRectangle();
				rectangle.switchRectangle(choice);
				break;
			}
			
			System.out.println("Would you like to go again?");
			
			again = scanner.nextLine();
		} while (again.equalsIgnoreCase("yes"));
		
		System.out.println("Goodbye!");
	}
}
