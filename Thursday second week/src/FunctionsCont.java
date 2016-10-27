
public class FunctionsCont {

	public static void main(String[] args) {
		int degrees = 4;
		temperature(degrees);

	}
	
	public static void temperature(int c) {
		if (c > 30) {
			System.out.println("It's hot outside!");
		}
		else if (c < 5) {
			System.out.println("Brr, consider wearing a jacket.");
		}
		else {
			System.out.println("It's not too cold or too hot.");
		}
		
	}

}
