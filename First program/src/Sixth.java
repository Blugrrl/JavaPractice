import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Sixth {

	public static void main(String[] args) {
		JFrame w = new JFrame("Test"); //Create new window, and define the window name
		JButton b = new JButton("OK"); // Create button, and name the button
		b.setForeground(Color.RED); // Calling upon "b" - button
		w.add(b); // add button to the "w" - the window
		w.setSize(300, 300);   //set size of the "w" - window
		w.setVisible(true);
		
	}

}
