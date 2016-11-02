
public class Rectangle {

		private double rectangleHeight;
		private double rectangleLength;
		
		public Rectangle() {
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
}
