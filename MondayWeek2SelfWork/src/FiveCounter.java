
public class FiveCounter {

	public static void main(String[] args) {
		for (int x = 1; x <= 5; x++) {
			System.out.println(x);
			counter();
			System.out.println("");
		}

	}
	
	public static void counter() {
		for (int x = 0; x < 5; x++) {
		System.out.println("Number" + x);
		}
		
		
	}

}
