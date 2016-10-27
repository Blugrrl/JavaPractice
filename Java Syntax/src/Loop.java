
public class Loop {

	public static void main(String[] args) {
		
		int[] j = {11,22,33,44,55};
		
		System.out.println(j[0]);
		
		for(int count = 0; count < j.length; count++) {
			System.out.println("Value of count is " + count);
			System.out.println("Array value of position count is " + j[count]);
		}

	}

}
