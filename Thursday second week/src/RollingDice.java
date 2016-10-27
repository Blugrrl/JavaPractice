
public class RollingDice {

	public static void main(String[] args) {
		int answer = rollDice();
		System.out.println("You roll the dice, the dice says: " + answer);

	}
	public static int rollDice() {

		double randomNumber = Math.random();
		randomNumber = randomNumber * 6 + 1; //six sided dice, if we dont want the result to be 0-5, then we have to add 1
		int number = (int) randomNumber;

		return number;
		
	}
	
}
