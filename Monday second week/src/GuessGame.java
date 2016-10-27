import javax.swing.JOptionPane;

public class GuessGame {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 1000 + 1); //math.random is a number from 0.0 to 0.9999, addding int to remove the decimals
		int guess;
		String sGuess = JOptionPane.showInputDialog("Guess my number! (1-1000)");
		guess = Integer.parseInt(sGuess);
		
		while (guess != number) {
			if (guess < number) {
				sGuess = JOptionPane.showInputDialog("Too small, guess again!");
			} else if (guess > number) {
				sGuess = JOptionPane.showInputDialog("Too big, guess again!");
			}
			guess = Integer.parseInt(sGuess); //convert string to integer
			
		}
		System.out.println("Correct!");
	}

}
