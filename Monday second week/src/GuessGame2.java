import javax.swing.JOptionPane;

public class GuessGame2 {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 1000 + 1); //math.random is a number from 0.0 to 0.9999, addding int to remove the decimals
		int guess;
		
		
		do {
			String sGuess = JOptionPane.showInputDialog("Guess my number! (1-1000)");
			guess = Integer.parseInt(sGuess); 
			if (guess < number) {
				System.out.println("Too small, guess again!");
			} else if (guess > number) {
				System.out.println("Too big, guess again!");
			}
			
			
		} while(guess != number);
		System.out.println("Correct!");
	
	}

}
