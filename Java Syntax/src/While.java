
public class While {

	public static void main(String[] args) {
		int[] myArray = {21,34,54,25,75,23,43,23,53,94};
		
		int numberUsed = 0;
		int total = 0;
		while (total < 100)
		{
			total += myArray[numberUsed];
			numberUsed++;
		
		}
		System.out.println("Total : " + total);
		System.out.println("Number used: " + numberUsed);

	}

}
