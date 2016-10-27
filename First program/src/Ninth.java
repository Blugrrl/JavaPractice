import javax.swing.JOptionPane;

public class Ninth {

	public static void main(String[] args) {
		String guessing = JOptionPane.showInputDialog("Guess the word!");
		while ( ! guessing.equals("Java")) {  //as long as the answer is not Java, keep doing:
			guessing = JOptionPane.showInputDialog("Wrong, guess again");
		
		}
		System.out.println("Finally correct!");
	}

}
