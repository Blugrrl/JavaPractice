
	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        boolean win = false;
	        boolean running = true;
	        System.out.println("Please enter the upper limit: ");
	        Game game = new Game(scan.nextInt());

	        while (running) {

	            System.out.println("Please enter a guess ");

	            while (!win) {
	                if (game.guess(scan.nextInt())) {
	                    win = true;

	                }
	            }
	            System.out.println("Would you like to play again y/n?");
	            String playAgain = scan.next();
	            if (playAgain.equalsIgnoreCase("y")) {
	                game.reset();
	                running = true;
	                win = false;
	            } else {
	                running = false;
	                System.out.println("Game over");
	                scan.close();
	            }
	        }
	    }
	}

