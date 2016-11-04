
public class CountingBlocks {
	
	public static int countBlocks(int levels) {
		int total = 0;
		for (int i = 1; i <= levels; i++ ) {
			total = total + (i * i);
		}
		return total;
	}

	public static void main(String[] args) {
		int total = countBlocks(3);
		
		System.out.println("The number of blocks needed is: " + total);
	}

}
