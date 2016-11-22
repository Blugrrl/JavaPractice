
public class Triangle {
	
	private double base;
	private double height;
	
	public Triangle() {
		//this.base = base;
		//this.height = height;
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

}
