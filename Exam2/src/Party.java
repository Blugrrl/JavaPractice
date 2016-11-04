import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people are there?");
		int people = sc.nextInt();
		
		
		if (people <= 10) {
			System.out.println("We are having a friendly gathering.");
		} else if (people > 10 && people < 30) {
			System.out.println("This is a party.");
		} else {
			System.out.println("WE ROCK!!!!");
		}

	}

}
