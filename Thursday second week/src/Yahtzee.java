
public class Yahtzee {

	public static void main(String[] args) {
//		keepRolling();
		int count = keepRolling();
		System.out.println("You rolled the dice " + count + " times to get Yahtzee.");
	}

	public static int keepRolling() {
//		RollingDice rollDice = new RollingDice();
		int dice1 = RollingDice.rollDice();
		int dice2 = RollingDice.rollDice();
		int dice3 = RollingDice.rollDice();
		int dice4 = RollingDice.rollDice();
		int dice5 = RollingDice.rollDice();
		int count = 1;
		while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
			dice1 = RollingDice.rollDice();
			dice2 = RollingDice.rollDice();
			dice3 = RollingDice.rollDice();
			dice4 = RollingDice.rollDice();
			dice5 = RollingDice.rollDice();
			count = count + 1;
		}
		return count;
	}
	
	
}
