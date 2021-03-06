
public class Circle {

	private double radius;
	private final double pi = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	public double area(double radius) {
		double area = radius * radius * pi;
		return area;
	}

	public double circumference(double radius) {
		double circumference = (radius * 2) * pi;
		return circumference;
	}

	public void switchCircle(String choice) {
		switch (choice) {
		case "area":
			System.out.println("The area is " + area(radius) + ".");
			break;
		case "circumference":
			System.out.println("The circumference is " + circumference(radius) + ".");
			break;
		default:
			System.out.println("Area is " + area(radius) + " and circumference is " + circumference(radius) + ".");
			break;
		}
	}
}
