import java.util.Scanner;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JFrame;

public class MyFirstGameInJava {
	

	public static void main(String[] args) {
		
		Actions die = new Actions();
		Actions tree = new Actions();
		Actions walk = new Actions();
		
	    String[] choices = { "New game", "Load game"};
	    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
	    		 "Adventure game", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
	    System.out.println(input);
		Scanner scan = new Scanner(System.in);
		String Username = JOptionPane.showInputDialog("Greetings kind sir / madam! Please enter your name to start the adventure");
		System.out.println("Greetings " + Username);
		System.out.println("Welcome to Choose your own adventure game");

		String firstOption = JOptionPane.showInputDialog("You find yourself on a deserted island in front of some trees, "
				+ "you can either hit the tree, or walk away");
		switch (firstOption.toLowerCase()) {
		case "hit the tree": case "hit":
		case "hit tree":
			tree.hitTree();
			break;
		case "walk away":
			walk.walkAway();
			break;
		default:
			System.out.println("Nothing happens...");
		}
		
		String chooseSecond = JOptionPane.showInputDialog("What will you do?");

		switch (chooseSecond.toLowerCase()) {
		case "eat": case "1": case "e":
		case "eat fruit":
			System.out.println("You eat the fruit and feel bad");
			die.youDie();
			
			break;
		case "throw": case "throw it": 
		case "throw fruit":
			System.out.println("By throwing the coconut, you awaken a tiger and he eats you");
			die.youDie();
			
			break;
		case "scream":
			System.out.println("As soon as you scream, a man shoots you down from a window from one of the houses");
			die.youDie();
			
			break;
		case "walk":
			System.out.println("You walked through the village, and you reach a fork in the road, "
					+ "one way leads through a jungle, the other by the shore. Choose wisely...");
			break;
		default:
			System.out.print("Nothing happened");
		}
		
		String chooseThird = JOptionPane.showInputDialog("");
		
		switch (chooseThird.toLowerCase()) {
		
		case "jungle": 
			System.out.println("You walk slowly to the jungle, hearing a roar in the distance");
			System.out.println("");
		
		}
				
		System.out.println("The end! Hope you enjoyed your adventure!!");
	}

}