
public class printPhoto {

	public static void main(String[] args) {
		photograph(20,30,true);

	}

	public static void photograph (int width, int height, boolean inColor) {
		System.out.println("The width is: " + width + "cm.");
		System.out.println("The height is: " + height + "cm.");
		
		if (inColor) {
			System.out.println("The photograph is in color.");
		}
		else {
			System.out.println("The photograph is black and white.");
		}
	}
}
