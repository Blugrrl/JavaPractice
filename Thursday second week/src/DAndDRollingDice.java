
public class DAndDRollingDice {

	public static void main(String[] args) {
		int diceEightSides = rollDice(8); //we set the number of the sides for the dice with the number in brackets 
		System.out.println("The eight sided dice rolled a: " + diceEightSides);
		int diceSixSides = rollDice(6); // we have to use the type (int in this case) if there is a return type defined in our functions 
		System.out.println("The six sided dice rolled a: " + diceSixSides);
	}
	
	public static int rollDice(int sides) {
		double randomNumber = Math.random();
		randomNumber = randomNumber * sides + 1;
		int resultDice = (int) randomNumber;
		return resultDice; 
		
	}
}
