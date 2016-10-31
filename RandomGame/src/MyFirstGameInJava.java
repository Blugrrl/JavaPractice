import java.util.Scanner;

public class MyFirstGameInJava {

	public static void main(String[] args) {

		System.out.println("Greetings kind sir / madam! Please enter your name to start the adventure");
		Scanner Username = new Scanner(System.in);
		String name = Username.nextLine();
		System.out.println("Greetings " + name);
		System.out.println("Welcome to Choose your own adventure game");
		System.out.println(
				"You find yourself on a deserted island in front of some trees, you can either hit the tree, or walk away");

		String chooseFirst = Username.nextLine();
		String firstOption = chooseFirst;
		switch (chooseFirst.toLowerCase()) {
		case "hit the tree": case "hit":
		case "hit tree":
			System.out.println("A mysterious fruit falls from the tree");
			System.out.println("You can either eat the fruit or throw it");
			break;
		case "walk away":
			System.out.println("You walk for some time and find a village. Maybe it is not so deserted!");
			System.out.println(
					"The village appears empty, you can either yell to see if anybody answers, or you can keep walking");
			break;
		default:
			System.out.println("Nothing happens...");
		}

		String chooseSecond = Username.nextLine();

		switch (chooseSecond.toLowerCase()) {
		case "eat": case "1": case "e":
		case "eat fruit":
			System.out.println("You eat the fruit and feel bad");
			System.out.println("You start feeling too weak, and lie down. You die..");
			break;
		case "throw": case "throw it": 
		case "throw fruit":
			System.out.println("By throwing the coconut, you awaken a tiger and he eats you");
			System.out.println("You are dead");
			break;
		case "scream":
			System.out.println("As soon as you scream, a man shoots you down from a window from one of the houses");
			System.out.println("You died...");
			break;
		case "walk":
			System.out.println("You walked through the village, and you reach a fork in the road, "
					+ "one way leads through a jungle, the other by the shore. Choose wisely...");
			break;
		default:
			System.out.print("Nothing happened");

		}
		
		String chooseThird = Username.nextLine();
		
		switch (chooseThird.toLowerCase()) {
		
		case "jungle": 
			System.out.println("You walk slowly to the jungle, hearing a roar in the distance");
			System.out.println("");
		
		
		}
		
		
//		System.out.println("The end! Hope you enjoyed your adventure!!");
	}

}