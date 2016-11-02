import java.util.Scanner;

public class Triangle {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area(double base, double height) {
		double area = (base * height) / 2;
		return area;
	}

	public double perimeter(double base) {
		double perimeter = base * 3;
		return perimeter;
	}
	
	public String choiceTriangle () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input base.");
		base = scanner.nextDouble();
		System.out.println("Input height.");
		height = scanner.nextDouble();
		scanner.nextLine();
		Triangle triangle = new Triangle(base, height);
		System.out.println("Do you want to calculate area, perimeter or both?");
		String choice = scanner.nextLine();
		return choice;
	}

	public void switchTriangle(String choice) {
		switch (choice) {
		case "area":
			System.out.println("The area is " + area(base, height) + ".");
			break;
		case "perimeter":
			System.out.println("The perimeter is " + perimeter(base) + ".");
			break;
		default:
			System.out.println("Area is " + area(base, height) + " and perimeter is " + perimeter(base) + ".");
			break;
		}
	}
}
