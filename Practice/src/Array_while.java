
public class Array_while {

	public static void main(String[] args) {


		int[] a = {12,23,31,34,56,68,75};
		
		int numberUsed = 0;
		int total = 0;
		
		while (total < 100)
		{
			total += a[numberUsed]; 
			numberUsed++;
		}
		
		if(total <= 100) System.out.println("The result is less, or equal to 100");
		if(total > 100) System.out.println("The result is above 100 and is " + total);

	}

}
