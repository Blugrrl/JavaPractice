
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

	public double circumference(double base) {
		double circumference = base * 3;
		return circumference;
	}

	public void switchTriangle(String choice) {
		switch (choice) {
		case "area":
			System.out.println("The area is " + area(base, height) + ".");
			break;
		case "circumference":
			System.out.println("The circumference is " + circumference(base) + ".");
			break;
		default:
			System.out.println("Area is " + area(base, height) + " and circumference is " + circumference(base) + ".");
			break;
		}
	}
}
