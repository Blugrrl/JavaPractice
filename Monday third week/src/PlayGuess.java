import javax.swing.JOptionPane;

public class PlayGuess {

	public static void main(String[] args) {
		int answer;
		
		do  {
			GuessingGame game = new GuessingGame(10);
			while (game.makeGuess() != true) {
				System.out.println("Guess # " + game.getNumberOfGuesses());
			}
			System.out.println("Average number of guesses is: " + GuessingGame.getAverage());
			answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
		} while (answer == JOptionPane.YES_OPTION);
	}

}
