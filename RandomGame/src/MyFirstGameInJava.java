import java.util.Scanner;

public class MyFirstGameInJava {

	public static void main(String[] args) {

		System.out.println("Greetings kind sir / mam! Please enter your name to start the adventure");
		Scanner Username = new Scanner(System.in);
		String name = Username.nextLine();
		System.out.println("Greetings " + name);
		System.out.println("Welcome to Choose your own adventure game");
		System.out.println(
				"You find yourself on a deserted island in front of some trees, you can either hit the tree, or walk away");

		String chooseFirst = Username.nextLine();

		switch (chooseFirst) {

		case "Hit tree":
			System.out.println("A mysterious fruit falls from the tree");
			System.out.println("You can either eat the fruit or throw it");
			break;
		case "Walk away":
			System.out.println("You walk for some time and find a village. Maybe it is not so deserted!");
			System.out.println(
					"The village appears empty, you can either yell to see if anybody answers, or you can keep walking");
			break;
		default:
			System.out.println("Nothing happens...");
		}

		String chooseSecond = Username.nextLine();

		switch (chooseSecond) {

		case "Eat fruit":
			System.out.println("You eat the fruit and feel bad");
			System.out.println("You start feeling too weak, and lie down. You die..");
			break;
		case "Throw fruit ":
			System.out.println("By throwing the coconut, you awaken a tiger and he eats you");
			System.out.println("You are dead");
			break;
		case "Scream":
			System.out.println("As soon as you scream, a man shoots you down from a window from one of the houses");
			System.out.println("You died...");
			break;
		case "Walk":
			System.out.println("You walked through the village, and you find a boat and leave the island");
			System.out.println("You win!");
			break;
		default:
			System.out.print("Nothing happend");

		}

	}

}