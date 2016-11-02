
public class Circle {
	
	double radius;
	final double pi = 3.14;
	
	
	public double area(double radius) {
		double area = radius * radius * pi;
		return area;
	}
	
	public double circumference(double radius) {
		double circumference = (radius * 2) * pi;
		return circumference;
	}

}
