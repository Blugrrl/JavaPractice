import javax.swing.JOptionPane;

public class GuessingGame {
	private int randomNumber;
	private int numberOfGuesses;
	
	private static int numberOfGames = 0;
	private static int totalNumberOfGuesses = 0;
	
	public GuessingGame(int range) {
		randomNumber = (int) (Math.random() * range + 1);
		System.out.println("New game with range: 1 - " + range);
		numberOfGuesses = 0;
	}
	
	public boolean makeGuess() {
		int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess"));
		numberOfGuesses++;
		totalNumberOfGuesses++;
		if (guess < randomNumber) {
			System.out.println("Your guess " + guess + " was too small!");
			return false;
		} else if (guess > randomNumber) {
			System.out.println("Your guess " + guess + " was too large");
			return false;
		} else {
			System.out.println("Your guess " + guess + " is correct!");
			numberOfGames++;
			return true;
		}
	}

	public int getNumberOfGuesses() {
		return numberOfGuesses;
	}
	
	public static double getAverage() {
		return (double) totalNumberOfGuesses / numberOfGames;
	}
}
