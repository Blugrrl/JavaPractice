import java.util.Scanner;

public class Rectangle {

	private double rectangleHeight;
	private double rectangleLength;

	public Rectangle(double rectangleHeight, double rectangleLength) {
		this.rectangleHeight = rectangleHeight;
		this.rectangleLength = rectangleLength;
	}

	public double getRectangleHeight() {
		return rectangleHeight;
	}

	public void setRectangleHeight(double rectangleHeight) {
		this.rectangleHeight = rectangleHeight;
	}

	public double getRectangleLength() {
		return rectangleLength;
	}

	public void setRectangleLength(double rectangleLength) {
		this.rectangleLength = rectangleLength;
	}

	public double area(double rectangleHeight, double rectangleLength) {
		double area = rectangleHeight * rectangleLength;
		return area;
	}

	public double perimeter(double rectangleHeight, double rectangleLength) {
		double perimeter = rectangleHeight * 2 + rectangleLength * 2;
		return perimeter;
	}
	
	public String choiceRectangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input height.");
		rectangleHeight = scanner.nextDouble();
		System.out.println("Input length.");
		rectangleLength = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Do you want to calculate area, perimeter or both?");
		String choice = scanner.nextLine();
		return choice;
	}

	public void switchRectangle(String choice) {
		switch (choice) {
		case "area":
			System.out.println("The area is " + area(rectangleHeight, rectangleLength));
			break;
		case "perimeter":
			System.out.println("The perimeter is " + perimeter(rectangleHeight, rectangleLength));
			break;
		default:
			System.out.println("Area is " + area(rectangleHeight, rectangleLength) + " and perimeter is "
					+ perimeter(rectangleHeight, rectangleLength));
			break;
		}
	}
}
