
public class Rectangle {

	private double rectangleHeight;
	private double rectangleLength;

	public Rectangle(double rectangleHeight, double rectangleLength) {
		this.rectangleHeight = rectangleHeight;
		this.rectangleLength = rectangleLength;
	}

	public double getHeight() {
		return rectangleHeight;
	}

	public void setHeight(double rectangleHeight) {
		this.rectangleHeight = rectangleHeight;
	}

	public double getLength() {
		return rectangleLength;
	}

	public void setLength(double rectangleLength) {
		this.rectangleLength = rectangleLength;
	}

	public double area(double rectangleHeight, double rectangleLength) {
		double area = rectangleHeight * rectangleLength;
		return area;
	}

	public double circumference(double height, double length) {
		double circumference = height * 2 + length * 2;
		return circumference;
	}

	public void switchRectangle(String choice) {
		switch (choice) {
		case "area":
			System.out.println("The area is " + area(rectangleHeight, rectangleLength));
			break;
		case "circumference":
			System.out.println("The circumference is " + circumference(rectangleHeight, rectangleLength));
			break;
		default:
			System.out.println("Area is " + area(rectangleHeight, rectangleLength) + " and circumference is "
					+ circumference(rectangleHeight, rectangleLength));
			break;
		}
	}
}
