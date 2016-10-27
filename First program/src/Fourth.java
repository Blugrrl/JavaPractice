import javax.swing.JOptionPane;

public class Fourth {

	public static void main(String[] args) {
		String inString = JOptionPane.showInputDialog("Give me a name: ");
		System.out.println("Hello " + inString + "!");
		
		String inCalString = JOptionPane.showInputDialog("Give me a number: ");
		double inCal = Double.parseDouble(inCalString);
		System.out.println(inCal + " times three is " + inCal * 3);

	}

}
