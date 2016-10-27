import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		
		int upperLimit = 1000;
		int number = (int) (Math.random() * upperLimit + 1); //math.random is a number from 0.0 to 0.9999, addding int to remove the decimals
		int guess;
		
		String sUpperLimit = JOptionPane.showInputDialog("Enter upper limit: ");
		upperLimit = Integer.parseInt(sUpperLimit);
		String sGuess = JOptionPane.showInputDialog("Guess my number!");
		guess = Integer.parseInt(sGuess);
		
		while (guess != number) {
			if (guess < number) {
				sGuess = JOptionPane.showInputDialog("Too small, guess again!");
			} else if (guess > number) {
				sGuess = JOptionPane.showInputDialog("Too big, guess again!");
			}
			guess = Integer.parseInt(sGuess); //convert string to integer
			upperLimit = Integer.parseInt(sUpperLimit);
		}
		System.out.println("Correct!");
	}

}
